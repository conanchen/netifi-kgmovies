package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface ProductQuery {

    ProductGQO product(String id, String productID) throws Exception;

}