package io.github.conanchen.shopping.graphql.api;

import io.github.conanchen.shopping.graphql.model.ProductGQO;

public interface ProductQuery {

    ProductGQO Product(String id, String ProductID) throws Exception;

}