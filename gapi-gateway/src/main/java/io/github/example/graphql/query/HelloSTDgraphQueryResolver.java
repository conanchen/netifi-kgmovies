package io.github.example.graphql.query;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import io.dgraph.DgraphClient;
import io.dgraph.DgraphProto.Response;

@Service
public class HelloSTDgraphQueryResolver implements GraphQLQueryResolver {
    private static final Logger LOG = LoggerFactory.getLogger(HelloDgraphQueryResolver.class);

    
    @Autowired
    DgraphClient dgraphClient;


    public String  helloSTDgraph(final String who) throws InterruptedException, ExecutionException {

        String resJson = queryWithStringTemplate();

        return String.format("Hello, %s! 【最简模式Graphql Resolver 直接调用Dgraph获取数据(查询语句模板化ST)】 resJson=%s", 
        Optional.ofNullable(who).orElse("GraphQL"),resJson);
    }

    private String queryWithStringTemplate(){
        
        // Query
        Response res = dgraphClient.newReadOnlyTransaction().query(queryFind_michael());
        String resJsonStr = res.getJson().toStringUtf8();

        // Print results
        LOG.info(String.format(" resJsonStr=%s\n",  resJsonStr));

        return resJsonStr;

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