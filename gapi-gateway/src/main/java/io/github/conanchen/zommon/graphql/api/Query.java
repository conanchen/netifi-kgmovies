package io.github.conanchen.zommon.graphql.api;

import io.github.conanchen.zommon.graphql.model.LocalBusinessConnectionGQO;
import io.github.conanchen.zommon.graphql.model.LocalBusinessGQO;

public interface Query {

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

}