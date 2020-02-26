package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.UpdateItemQuantityInputGQO;

public interface CartIncrementItemQuantityMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input) throws Exception;

}