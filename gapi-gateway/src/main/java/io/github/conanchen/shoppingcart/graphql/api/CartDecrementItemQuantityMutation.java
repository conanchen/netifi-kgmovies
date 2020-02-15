package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartDecrementItemQuantityMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input) throws Exception;

}