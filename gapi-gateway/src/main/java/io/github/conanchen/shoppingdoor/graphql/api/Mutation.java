package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;

public interface Mutation {

    @javax.validation.constraints.NotNull
    ProductGQO createProduct(String name) throws Exception;

}