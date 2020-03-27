package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreFilterGQO;
import io.github.conanchen.place.graphql.model.StoreGQO;
import io.github.conanchen.place.graphql.model.StoreOrderGQO;

import java.util.Collection;

public interface StoreSearch1Query {

    Collection<StoreGQO> storeSearch1(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset) throws Exception;

}