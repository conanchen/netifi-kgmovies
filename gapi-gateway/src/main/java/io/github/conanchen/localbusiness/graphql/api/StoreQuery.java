package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.StoreGQO;

public interface StoreQuery {

    StoreGQO store(String id, String storeID) throws Exception;

}