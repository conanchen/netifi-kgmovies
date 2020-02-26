package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutCustomerDisassociateMutation {

    CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId) throws Exception;

}