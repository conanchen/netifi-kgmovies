package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoresConnectionGQO;

public interface AllStoresQuery {

    StoresConnectionGQO allStores(String after, Integer first, String before, Integer last) throws Exception;

}