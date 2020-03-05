package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductModelUpdateInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductModelUpdatePayloadGQO;

public interface ProductModelUpdateMutation {

    @javax.validation.constraints.NotNull
    ProductModelUpdatePayloadGQO productModelUpdate(ProductModelUpdateInputGQO input) throws Exception;

}