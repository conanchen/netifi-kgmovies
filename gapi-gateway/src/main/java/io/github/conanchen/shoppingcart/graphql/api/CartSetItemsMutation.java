package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartSetItemsMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartSetItems(SetCartItemsInputGQO input) throws Exception;

}