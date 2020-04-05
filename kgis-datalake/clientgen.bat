chcp 65001
echo "Deploy START" && ..\gradlew :downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://localhost:8080/graphql -Pcom.apollographql.apollo.schema=kgis_schema.json && cd src/main/graphql && cd ../../../ && bundle && ruby update_schema.rb && gradlew :uploadArchives && echo "Deploy END"
