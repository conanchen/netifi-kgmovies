package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreConnectionGQO;
import io.github.conanchen.place.graphql.model.StoreFilterGQO;
import io.github.conanchen.place.graphql.model.StoreOrderGQO;

public interface StoreSearchQuery {

    StoreConnectionGQO storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last) throws Exception;

}