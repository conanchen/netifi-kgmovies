#!/usr/bin/env ruby

require 'colorize'
require 'bundler/setup'
require 'graphql_java_gen'
require 'graphql_schema'
require 'json'
require 'optparse'
require 'net/http'
require 'fileutils'

puts "Hello, world!".colorize(:red)

OptionParser.new do |opts|
  opts.on("-tFILENAME", "--target=FILENAME", "Target file name") do |filename|
    target_filename = filename
  end
end.parse!

shared_storefront_api_key = "4a6c829ec3cb12ef9004bf8ed27adf12"
storefront_api_version = '2020-01'

introspection_result = File.read("kgis-dgschema.json")
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
  package_name: "io.github.kgis.client",
  nest_under: 'KgisSchema',
  custom_scalars: custom_scalars,
  include_deprecated: true
).save_granular("#{Dir.pwd}/../src/main/java/io/github/kgis/client")

puts "Generated! check #{Dir.pwd}/../src/main/java/io/github/kgis/client".colorize(:red)
