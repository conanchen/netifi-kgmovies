package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface OrderQuery {

    OrderGQO order(String id, String orderID) throws Exception;

}