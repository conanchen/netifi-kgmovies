package io.github.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.gson.Gson;
import io.dgraph.DgraphClient;
import io.dgraph.DgraphProto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class HelloDgraphSTQueryResolver implements GraphQLQueryResolver {
    private static final Logger LOG = LoggerFactory.getLogger(HelloDgraphQueryResolver.class);

    
    @Autowired
    DgraphClient dgraphClient;


    public String  helloSTDgraph(final String who) throws InterruptedException, ExecutionException {

        String resJson = queryWithStringTemplate();
        
        queryAllWithStringTemplate();

        return String.format("Hello, %s! 【最简模式Graphql Resolver 直接调用Dgraph获取数据(查询语句模板化ST)】 resJson=%s", 
        Optional.ofNullable(who).orElse("GraphQL"),resJson);
    }

    // Refer to https://github.com/antlr/stringtemplate4/blob/94967dd4be3f21f36ecf17224180bd2b2ae97241/benchmark/org/stringtemplate/v4/benchmark/OliverTest.java
    private String queryWithStringTemplate(){
        
        // Query
        Response res = dgraphClient.newReadOnlyTransaction().query(queryFind_michael());
        String resJsonStr = res.getJson().toStringUtf8();

        // Print results
        LOG.info(String.format(" resJsonStr=%s\n",  resJsonStr));

        return resJsonStr;

    }

    private void queryAllWithStringTemplate(){
        Gson gson = new Gson(); // For JSON encode/decode
        
        // Query
        Map<String, String> vars = Collections.singletonMap("$a", "Michael");
        Response res = dgraphClient.newTransaction().queryWithVars(queryAll(), vars);
        String resJsonStr = res.getJson().toStringUtf8();

        // Deserialize
        People ppl = gson.fromJson(res.getJson().toStringUtf8(), People.class);

        // Print results
        LOG.info(String.format("people found: %d resJsonStr=%s\n", ppl.all.size(),resJsonStr));
        ppl.all.forEach(person -> LOG.info(String.format("person.name=%s",person.name)));
    }

    interface QueryTemplate {
        String query(String tplname);
    }
    
    static STGroup test = new STGroupFile("templates/graphql/email.stg");
    
    static String queryFind_michael(){
        ST find_michael =test.getInstanceOf("find_michael");
        String result =  find_michael.render();
        return result;
    }

    static String queryAll(){
        ST find_michael =test.getInstanceOf("queryall");
        String result =  find_michael.render();
        return result;
    }

    static class Person {
        String name;
        String uid;

        Person() {}
    }

    static class People {
        List<Person> all;

        People() {}
    }

}