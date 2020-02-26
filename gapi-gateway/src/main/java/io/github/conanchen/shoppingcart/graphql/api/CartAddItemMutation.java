package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.AddToCartInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;

public interface CartAddItemMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartAddItem(AddToCartInputGQO input) throws Exception;

}