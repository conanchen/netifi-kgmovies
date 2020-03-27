package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.LocalBusinessConnectionGQO;
import io.github.conanchen.place.graphql.model.LocalBusinessFilterGQO;
import io.github.conanchen.place.graphql.model.LocalBusinessOrderGQO;

public interface LocalBusinessSearchQuery {

    LocalBusinessConnectionGQO localBusinessSearch(LocalBusinessFilterGQO filter, LocalBusinessOrderGQO order, Integer first, Integer offset) throws Exception;

}