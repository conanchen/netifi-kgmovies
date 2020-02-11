package io.github.conanchen.shopping.graphql.api;

import io.github.conanchen.shopping.graphql.model.ProductGQO;
import io.github.conanchen.shopping.graphql.model.ProductsConnectionGQO;

public interface Query {

    ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last) throws Exception;

    ProductGQO Product(String id, String ProductID) throws Exception;

}