package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreGQO;

public interface StoreQuery {

    StoreGQO store(String id, String storeID) throws Exception;

}