package io.github.conanchen.shoppingfulfill.graphql.api;

import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingfulfill.graphql.model.HomeserviceDeliveryGQO;
import io.github.conanchen.shoppingfulfill.graphql.model.ParcelDeliveryGQO;

public interface Query {
// KK
    ParcelDeliveryGQO parcelDelivery(String id, String parelId, DataFetchingEnvironment env) throws Exception;
    HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId, DataFetchingEnvironment env) throws Exception;
}