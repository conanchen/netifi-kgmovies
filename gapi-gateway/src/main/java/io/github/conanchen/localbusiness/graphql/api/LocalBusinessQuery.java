package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.zommon.graphql.model.LocalBusinessGQO;

public interface LocalBusinessQuery {

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

}