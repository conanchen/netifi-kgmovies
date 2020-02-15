package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartEmptyMutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartEmpty(EmptyCartInputGQO input) throws Exception;

}