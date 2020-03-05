package io.github.conanchen.shoppingfulfill.graphql.api;

import io.github.conanchen.shoppingfulfill.graphql.model.HomeserviceDeliveryGQO;

public interface HomeserviceDeliveryQuery {

    HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId) throws Exception;

}