package io.github.conanchen.shopping.graphql.api;

import io.github.conanchen.shopping.graphql.model.ProductGQO;

public interface Mutation {

    @javax.validation.constraints.NotNull
    ProductGQO createProduct(String name) throws Exception;

}