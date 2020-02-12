package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface Query {

    ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last) throws Exception;

    ProductGQO product(String id, String productID) throws Exception;

    ServiceGQO service(String id, String serviceID) throws Exception;

    FoodServiceGQO foodService(String id, String serviceID) throws Exception;

    GeneralServiceGQO generalService(String id, String serviceID) throws Exception;

    GovernmentServiceGQO governmentService(String id, String serviceID) throws Exception;

    OrderGQO order(String id, String orderID) throws Exception;

}