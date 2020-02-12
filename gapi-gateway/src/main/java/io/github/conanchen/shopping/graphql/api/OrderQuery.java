package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface OrderQuery {

    OrderGQO order(String id, String orderID) throws Exception;

}