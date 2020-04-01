package io.github.conanchen.shoppingdoor.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingdoor.graphql.api.Query;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import org.springframework.stereotype.Service;


@Service
public class ShoppingdoorQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public Connection<ProductGQO> productSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public ProductGQO product(String id, String productID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public GeneralProductGQO generalProduct(String id, String productID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public Connection<ServiceGQO> serviceSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public ServiceGQO service(String id, String serviceID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public FoodServiceGQO foodService(String id, String serviceID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public GeneralServiceGQO generalService(String id, String serviceID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public GovernmentServiceGQO governmentService(String id, String serviceID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public HousekeepingServiceGQO housekeepingService(String id, String serviceID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ItemCategoryGQO itemCategory(String id, String itcgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public OfferGQO offer(String id, String offerID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public DemandGQO demand(String id, String demandID, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}