package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.EmptyCartInputGQO;

public interface CartEmptyMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartEmpty(EmptyCartInputGQO input) throws Exception;

}