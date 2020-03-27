package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.LocalBusinessGQO;

public interface LocalBusinessFindQuery {

    LocalBusinessGQO localBusinessFind(String id, String lbsID) throws Exception;

}