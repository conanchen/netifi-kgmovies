package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.LocalBusinessGQO;

public interface LocalBusinessQuery {

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

}