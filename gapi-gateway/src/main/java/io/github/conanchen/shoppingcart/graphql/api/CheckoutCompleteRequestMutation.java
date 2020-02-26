package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompletePayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompleteRequestInputGQO;

public interface CheckoutCompleteRequestMutation {

    CheckoutCompletePayloadGQO checkoutCompleteRequest(CheckoutCompleteRequestInputGQO input) throws Exception;

}