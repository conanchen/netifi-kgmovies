package io.github.config;

import com.google.common.collect.Lists;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

@Slf4j
@Service
public class MyTypeQueriesResolver implements GraphQLQueryResolver {

    public MyType findMyType(String id, DataFetchingEnvironment env) throws Exception {
        MyType myType = new MyType();
        myType.put("myField", "my field value");
        myType.put("name", "my name value");
        return myType;

    }

    public Collection<HashMap> searchHisType(String id, Integer page, DataFetchingEnvironment env) throws Exception {
        return Lists.newArrayList(
                new HashMap() {{
                    put("hisField", "his field value");
                    put("name", "his name value");
                }},
                new HashMap() {{
                    put("hisField", "his field value1");
                    put("name", "his name value1");
                }},
                new HashMap() {{
                    put("hisField", "his field value2");
                    put("name", "his name value3");
                }},
                new HashMap() {{
                    put("hisField", "his field value4");
                    put("name", "his name value4");
                }}
        );
    }
}