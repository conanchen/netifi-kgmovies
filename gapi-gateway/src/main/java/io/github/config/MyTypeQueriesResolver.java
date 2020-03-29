package io.github.config;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyTypeQueriesResolver implements GraphQLQueryResolver {

    public MyType findMyType(String id, DataFetchingEnvironment env) throws Exception {
        MyType myType =  new MyType();
        myType.put("myField","my field value");
        myType.put("name","my name value");
        return myType;

    }
}