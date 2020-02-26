package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.UpdateItemQuantityInputGQO;

public interface CartDecrementItemQuantityMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input) throws Exception;

}