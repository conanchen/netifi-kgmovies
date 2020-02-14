package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.StoresConnectionGQO;

public interface AllStoresQuery {

    StoresConnectionGQO allStores(String after, Integer first, String before, Integer last) throws Exception;

}