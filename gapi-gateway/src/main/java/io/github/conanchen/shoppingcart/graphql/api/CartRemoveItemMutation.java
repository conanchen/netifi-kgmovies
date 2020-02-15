package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartRemoveItemMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input) throws Exception;

}