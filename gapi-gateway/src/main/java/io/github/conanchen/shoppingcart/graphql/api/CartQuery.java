package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartGQO;
import io.github.conanchen.shoppingcart.graphql.model.CurrencyInputGQO;

public interface CartQuery {

    CartGQO cart(String id, CurrencyInputGQO currency) throws Exception;

}