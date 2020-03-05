package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductModelCreateInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductModelCreatePayloadGQO;

public interface ProductModelCreateMutation {

    @javax.validation.constraints.NotNull
    ProductModelCreatePayloadGQO productModelCreate(ProductModelCreateInputGQO input) throws Exception;

}