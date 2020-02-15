package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.DemandGQO;
import io.github.conanchen.shoppingdoor.graphql.model.FoodServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GeneralProductGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GeneralServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GovernmentServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.HousekeepingServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ItemCategoryGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingdoor.graphql.model.PostalAddressGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductsConnectionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ServicesConnectionGQO;

public interface Query {

    ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last) throws Exception;

    ProductGQO product(String id, String productID) throws Exception;

    GeneralProductGQO generalProduct(String id, String productID) throws Exception;

    ServicesConnectionGQO allServices(String after, Integer first, String before, Integer last) throws Exception;

    ServiceGQO service(String id, String serviceID) throws Exception;

    FoodServiceGQO foodService(String id, String serviceID) throws Exception;

    GeneralServiceGQO generalService(String id, String serviceID) throws Exception;

    GovernmentServiceGQO governmentService(String id, String serviceID) throws Exception;

    HousekeepingServiceGQO housekeepingService(String id, String serviceID) throws Exception;

    ItemCategoryGQO itemCategory(String id, String itcgID) throws Exception;

    PostalAddressGQO postalAddress(String id, String paID) throws Exception;

    OfferGQO offer(String id, String offerID) throws Exception;

    DemandGQO demand(String id, String demandID) throws Exception;

}