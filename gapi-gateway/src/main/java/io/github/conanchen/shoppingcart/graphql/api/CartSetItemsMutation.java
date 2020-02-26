package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.SetCartItemsInputGQO;

public interface CartSetItemsMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartSetItems(SetCartItemsInputGQO input) throws Exception;

}