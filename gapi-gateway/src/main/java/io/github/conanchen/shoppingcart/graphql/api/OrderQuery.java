package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.OrderGQO;

public interface OrderQuery {

    OrderGQO order(String id, String orderID) throws Exception;

}