package io.github.conanchen.shoppingdoor.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
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
    public Connection<ProductGQO> productSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    ProductGQO product(String id, String productID, DataFetchingEnvironment env) throws Exception;
    GeneralProductGQO generalProduct(String id, String productID, DataFetchingEnvironment env) throws Exception;
    public Connection<ServiceGQO> serviceSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    ServiceGQO service(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    FoodServiceGQO foodService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    GeneralServiceGQO generalService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    GovernmentServiceGQO governmentService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    HousekeepingServiceGQO housekeepingService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    ItemCategoryGQO itemCategory(String id, String itcgID, DataFetchingEnvironment env) throws Exception;
    OfferGQO offer(String id, String offerID, DataFetchingEnvironment env) throws Exception;
    DemandGQO demand(String id, String demandID, DataFetchingEnvironment env) throws Exception;
}