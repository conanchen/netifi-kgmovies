package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.ChildcareGQO;
import io.github.conanchen.localbusiness.graphql.model.EldercareGQO;
import io.github.conanchen.localbusiness.graphql.model.LocalBusinessConnectionGQO;
import io.github.conanchen.localbusiness.graphql.model.StoreGQO;
import io.github.conanchen.localbusiness.graphql.model.StoresConnectionGQO;
import io.github.conanchen.zommon.graphql.model.LocalBusinessGQO;

public interface Query {

    StoresConnectionGQO allStores(String after, Integer first, String before, Integer last) throws Exception;

    StoreGQO store(String id, String storeID) throws Exception;

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

    ChildcareGQO childcare(String id, String lbsID) throws Exception;

    EldercareGQO eldercare(String id, String lbsID) throws Exception;

}