package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.ProductsConnectionGQO;

public interface AllProductsQuery {

    ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last) throws Exception;

}