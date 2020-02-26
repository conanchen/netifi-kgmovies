package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.DefaultPlaceGQO;

public interface DefaultPlaceQuery {

    DefaultPlaceGQO defaultPlace(String id, String defID) throws Exception;

}