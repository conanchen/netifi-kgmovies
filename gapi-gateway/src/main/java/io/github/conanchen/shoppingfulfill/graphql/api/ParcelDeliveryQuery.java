package io.github.conanchen.shoppingfulfill.graphql.api;

import io.github.conanchen.shoppingfulfill.graphql.model.ParcelDeliveryGQO;

public interface ParcelDeliveryQuery {

    ParcelDeliveryGQO parcelDelivery(String id, String parelId) throws Exception;

}