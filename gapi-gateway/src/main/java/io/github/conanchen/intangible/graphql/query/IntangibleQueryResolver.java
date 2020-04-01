package io.github.conanchen.intangible.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.intangible.graphql.api.Query;
import io.github.conanchen.intangible.graphql.model.BrandGQO;
import org.springframework.stereotype.Service;


@Service
public class IntangibleQueryResolver implements Query, GraphQLQueryResolver {


    @Override
    public Connection<BrandGQO> allBrand(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public BrandGQO brand(String id, String brandID, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}