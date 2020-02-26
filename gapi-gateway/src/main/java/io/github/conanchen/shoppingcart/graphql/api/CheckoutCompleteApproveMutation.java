package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompleteApproveInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompletePayloadGQO;

public interface CheckoutCompleteApproveMutation {

    CheckoutCompletePayloadGQO checkoutCompleteApprove(CheckoutCompleteApproveInputGQO input) throws Exception;

}