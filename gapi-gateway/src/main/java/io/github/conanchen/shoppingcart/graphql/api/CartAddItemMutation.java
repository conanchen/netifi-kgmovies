package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartAddItemMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartAddItem(AddToCartInputGQO input) throws Exception;

}