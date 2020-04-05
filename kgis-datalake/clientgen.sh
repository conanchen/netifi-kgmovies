#!/bin/bash

echo "BEGIN开始生成kgis graphql client sdk"

../gradlew :kgis-datalake:downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://localhost:8080/graphql -Pcom.apollographql.apollo.schema=kgis_schema.json

bundle

ruby update_schema.rb

../gradlew :kgis-datalake:uploadArchives

echo "END结束生成kgis graphql client sdk"
