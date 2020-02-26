package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutEmailUpdateMutation {

    CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email) throws Exception;

}