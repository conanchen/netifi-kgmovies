package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutGQO;

public interface CheckoutQuery {

    CheckoutGQO checkout(String id, String checkoutID) throws Exception;

}