package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.GeneralProductGQO;

public interface GeneralProductQuery {

    GeneralProductGQO generalProduct(String id, String productID) throws Exception;

}