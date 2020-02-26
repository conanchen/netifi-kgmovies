package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.*;

public interface Query {

    DefaultPlaceGQO defaultPlace(String id, String defID) throws Exception;

    AdministrativeAreaGQO administrativeArea(String id, String defID) throws Exception;

    StoresConnectionGQO allStores(String after, Integer first, String before, Integer last) throws Exception;

    StoreGQO store(String id, String storeID) throws Exception;

    ChildcareGQO childcare(String id, String lbsID) throws Exception;

    EldercareGQO eldercare(String id, String lbsID) throws Exception;

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

}