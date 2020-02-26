package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutPhoneUpdateMutation {

    CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email) throws Exception;

}