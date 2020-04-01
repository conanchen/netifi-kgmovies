package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductCreateInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductCreatePayloadGQO;

public interface ProductCreateMutation {

    @javax.validation.constraints.NotNull
    ProductCreatePayloadGQO productCreate(ProductCreateInputGQO input) throws Exception;

}