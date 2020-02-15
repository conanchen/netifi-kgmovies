package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;

public interface ProductQuery {

    ProductGQO product(String id, String productID) throws Exception;

}