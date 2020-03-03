package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.*;

import java.util.Collection;

public interface Query {

    DefaultPlaceGQO defaultPlaceFind(String id, String defID) throws Exception;

    AdministrativeAreaGQO administrativeAreaFind(String id, String defID) throws Exception;

    StoreConnectionGQO storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last) throws Exception;

    Collection<StoreGQO> storeSearch1(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset) throws Exception;

    StoreGQO storeFind(String id, String storeID) throws Exception;

    ChildcareGQO childcareFind(String id, String lbsID) throws Exception;

    EldercareGQO eldercareFind(String id, String lbsID) throws Exception;

    LocalBusinessConnectionGQO localBusinessSearch(LocalBusinessFilterGQO filter, LocalBusinessOrderGQO order, Integer first, Integer offset) throws Exception;

    LocalBusinessGQO localBusinessFind(String id, String lbsID) throws Exception;

}