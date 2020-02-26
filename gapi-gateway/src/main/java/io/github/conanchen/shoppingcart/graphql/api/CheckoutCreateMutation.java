package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutCreateInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutCreateMutation {

    CheckoutPayloadGQO checkoutCreate(CheckoutCreateInputGQO input) throws Exception;

}