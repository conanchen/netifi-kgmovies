package io.github.conanchen.shopping.graphql.api;

import io.github.conanchen.shopping.graphql.model.ProductsConnectionGQO;

public interface AllProductsQuery {

    ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last) throws Exception;

}