package io.github.conanchen.shoppingfulfill.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingfulfill.graphql.api.Query;
import io.github.conanchen.shoppingfulfill.graphql.model.HomeserviceDeliveryGQO;
import io.github.conanchen.shoppingfulfill.graphql.model.ParcelDeliveryGQO;
import org.springframework.stereotype.Service;


@Service
public class FulfillQueriesResolver implements Query , GraphQLQueryResolver {


    @Override
    public ParcelDeliveryGQO parcelDelivery(String id, String parelId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}