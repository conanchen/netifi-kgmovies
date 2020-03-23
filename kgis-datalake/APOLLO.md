# 集成Apollo

[参考](https://www.apollographql.com/docs/android/essentials/get-started/#downloading-a-schemajson-file)

Downloading a schema.json file
You can get a schema.json file by running an introspection query on your endpoint. The Apollo Gradle plugin exposes a downloadApolloSchema task to help with this. You can download a schema by specifying your endpoint and the location where you want the schema to be downloaded:

```bash
../gradlew :kgis-datalake:downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://localhost:8080/graphql -Pcom.apollographql.apollo.schema=src/main/graphql/io/github/io.github.kgis/dgraph-schema.json
```
也可以直接用intellij Gradle任务Tasks/apollo/downloadApolloSchema进行

