package io.github.conanchen.shoppingfulfill.graphql.api;

import io.github.conanchen.shoppingfulfill.graphql.model.HomeserviceDeliveryGQO;
import io.github.conanchen.shoppingfulfill.graphql.model.ParcelDeliveryGQO;

public interface Query {

    ParcelDeliveryGQO parcelDelivery(String id, String parelId) throws Exception;

    HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId) throws Exception;

}