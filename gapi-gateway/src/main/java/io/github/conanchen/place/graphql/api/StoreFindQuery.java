package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreGQO;

public interface StoreFindQuery {

    StoreGQO storeFind(String id, String storeID) throws Exception;

}