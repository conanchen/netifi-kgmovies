package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    DefaultPlaceGQO defaultPlaceFind(String id, String defID, DataFetchingEnvironment env) throws Exception;
    AdministrativeAreaGQO administrativeAreaFind(String id, String defID, DataFetchingEnvironment env) throws Exception;
    public Connection<StoreGQO> storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    Collection<StoreGQO> storeSearch1(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) throws Exception;
    StoreGQO storeFind(String id, String storeID, DataFetchingEnvironment env) throws Exception;
    ChildcareGQO childcareFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception;
    EldercareGQO eldercareFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception;
    public Connection<LocalBusinessGQO> localBusinessSearch(LocalBusinessFilterGQO filter, LocalBusinessOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    LocalBusinessGQO localBusinessFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception;
}