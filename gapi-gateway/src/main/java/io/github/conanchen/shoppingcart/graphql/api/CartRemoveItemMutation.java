package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.RemoveCartItemInputGQO;

public interface CartRemoveItemMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input) throws Exception;

}