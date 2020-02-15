package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartUpdateItemMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input) throws Exception;

}