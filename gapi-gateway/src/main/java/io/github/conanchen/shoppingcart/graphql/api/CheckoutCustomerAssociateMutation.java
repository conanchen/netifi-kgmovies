package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutCustomerAssociateMutation {

    CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken) throws Exception;

}