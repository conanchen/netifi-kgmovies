#!/usr/bin/env ruby

require 'bundler/setup'
require 'graphql_java_gen'
require 'graphql_schema'
require 'json'
require 'optparse'
require 'net/http'
require 'fileutils'

target_filename = 'src/main/java/io/github/kgis/graphql'
OptionParser.new do |opts|
  opts.on("-tFILENAME", "--target=FILENAME", "Target file name") do |filename|
    target_filename = filename
  end
end.parse!


introspection_result = File.read("src/main/graphql/schema.json")
schema = GraphQLSchema.new(JSON.parse(introspection_result))




custom_scalars = [
  GraphQLJavaGen::Scalar.new(
    type_name: 'Money',
    java_type: 'BigDecimal',
    deserialize_expr: ->(expr) { "new BigDecimal(jsonAsString(#{expr}, key))" },
    imports: ['java.math.BigDecimal'],
  ),
  GraphQLJavaGen::Scalar.new(
    type_name: 'DateTime',
    java_type: 'DateTime',
    deserialize_expr: ->(expr) { "Utils.parseDateTime(jsonAsString(#{expr}, key))" },
    imports: ['org.joda.time.DateTime'],
  )
]

GraphQLJavaGen.new(
  schema,
  package_name: "io.github.kgis.graphql",
  nest_under: 'Storefront',
  custom_scalars: custom_scalars,
  include_deprecated: true
).save_granular(target_filename)
