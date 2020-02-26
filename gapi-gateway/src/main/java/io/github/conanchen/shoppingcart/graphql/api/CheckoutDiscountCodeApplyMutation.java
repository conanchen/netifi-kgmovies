package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutDiscountCodeApplyMutation {

    CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId) throws Exception;

}