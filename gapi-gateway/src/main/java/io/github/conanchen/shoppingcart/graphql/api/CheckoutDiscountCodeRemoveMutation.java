package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;

public interface CheckoutDiscountCodeRemoveMutation {

    CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId) throws Exception;

}