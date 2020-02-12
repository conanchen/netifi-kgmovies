package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface FoodServiceQuery {

    FoodServiceGQO foodService(String id, String serviceID) throws Exception;

}