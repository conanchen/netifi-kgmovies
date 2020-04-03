
echo "Deploy START" && ./gradlew :downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://192.168.0.43:8080/graphql -Pcom.apollographql.apollo.schema=src/main/graphql/schema.json && cd src/main/graphql && java -jar schema-utils.jar schema.json && cd ../../../ && bundle && ruby update_schema.rb && ./gradlew :uploadArchives && echo "Deploy END"
