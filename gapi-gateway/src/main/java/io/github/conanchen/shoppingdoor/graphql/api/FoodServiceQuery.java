package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.FoodServiceGQO;

public interface FoodServiceQuery {

    FoodServiceGQO foodService(String id, String serviceID) throws Exception;

}