package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.DefaultPlaceGQO;

public interface DefaultPlaceFindQuery {

    DefaultPlaceGQO defaultPlaceFind(String id, String defID) throws Exception;

}