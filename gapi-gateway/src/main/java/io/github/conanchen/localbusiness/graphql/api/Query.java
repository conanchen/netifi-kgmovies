package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.ChildcareGQO;
import io.github.conanchen.localbusiness.graphql.model.EldercareGQO;
import io.github.conanchen.localbusiness.graphql.model.StoreGQO;
import io.github.conanchen.localbusiness.graphql.model.StoresConnectionGQO;

public interface Query {

    StoresConnectionGQO allStores(String after, Integer first, String before, Integer last) throws Exception;

    StoreGQO store(String id, String storeID) throws Exception;


    ChildcareGQO childcare(String id, String lbsID) throws Exception;

    EldercareGQO eldercare(String id, String lbsID) throws Exception;

}