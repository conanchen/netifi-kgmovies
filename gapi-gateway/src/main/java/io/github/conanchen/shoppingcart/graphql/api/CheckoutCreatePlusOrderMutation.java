package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutCreatePlusOrderInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutCreatePlusOrderMutation {

    CheckoutPayloadGQO checkoutCreatePlusOrder(CheckoutCreatePlusOrderInputGQO input) throws Exception;

}