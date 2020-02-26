package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.UpdateCartItemInputGQO;

public interface CartUpdateItemMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input) throws Exception;

}