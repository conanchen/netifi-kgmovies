package io.github.conanchen.shoppingfulfill.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.shoppingfulfill.graphql.api.Query;
import io.github.conanchen.shoppingfulfill.graphql.model.HomeserviceDeliveryGQO;
import io.github.conanchen.shoppingfulfill.graphql.model.ParcelDeliveryGQO;
import org.springframework.stereotype.Service;


@Service
public class FulfillQueriesResolver implements Query , GraphQLQueryResolver {


    @Override
    public ParcelDeliveryGQO parcelDelivery(String id, String parelId) throws Exception {
        return null;
    }

    @Override
    public HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId) throws Exception {
        return null;
    }
}