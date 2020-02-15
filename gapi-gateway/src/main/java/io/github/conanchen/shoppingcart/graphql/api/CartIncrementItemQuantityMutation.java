package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartIncrementItemQuantityMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input) throws Exception;

}