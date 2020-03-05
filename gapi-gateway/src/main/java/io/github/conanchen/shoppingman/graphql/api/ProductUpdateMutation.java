package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.*;
import java.util.*;

public interface ProductUpdateMutation {

    @javax.validation.constraints.NotNull
    ProductUpdatePayloadGQO productUpdate(ProductUpdateInputGQO input) throws Exception;

}