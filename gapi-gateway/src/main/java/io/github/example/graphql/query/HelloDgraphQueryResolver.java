package io.github.example.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import io.dgraph.DgraphClient;
import io.dgraph.DgraphProto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class HelloDgraphQueryResolver implements GraphQLQueryResolver {
    private static final Logger LOG = LoggerFactory.getLogger(HelloDgraphQueryResolver.class);

    
    @Autowired
    DgraphClient dgraphClient;


    public String  helloDgraph(final String who) throws InterruptedException, ExecutionException {

        ByteString resJson = dgraphClient.newReadOnlyTransaction().query(queryForPerson).getJson();
        
        LOG.info(String.format("%s resJson=%s", this.getClass().getName(), resJson.toStringUtf8()));

        queryPPL();

        return String.format("Hello, %s! 【最简模式Graphql Resolver 直接调用Dgraph获取数据】 resJson=%s", 
        Optional.ofNullable(who).orElse("GraphQL"),resJson.toStringUtf8());
    }

    private void queryPPL(){
        Gson gson = new Gson(); // For JSON encode/decode
        
        // Query
        Map<String, String> vars = Collections.singletonMap("$a", "Michael");
        Response res = dgraphClient.newTransaction().queryWithVars(query, vars);

        // Deserialize
        People ppl = gson.fromJson(res.getJson().toStringUtf8(), People.class);

        // Print results
        LOG.info(String.format("people found: %d\n", ppl.all.size()));
        ppl.all.forEach(person -> LOG.info(person.name));
    }

    private static String query =
    "query all($a: string){\n" + "all(func: eq(name, $a)) {\n" + "    name\n" + "  }\n" + "}";

    private static String queryForPerson =
    "{ \n" +
            "everyone(func: anyofterms(name, \"Michael Catalina\")) { \n" +
            "name\n" +
            "uid\n" +
            "}\n" +
    "}";

    static class Person {
        String name;

        Person() {}
    }

    static class People {
        List<Person> all;

        People() {}
    }

}