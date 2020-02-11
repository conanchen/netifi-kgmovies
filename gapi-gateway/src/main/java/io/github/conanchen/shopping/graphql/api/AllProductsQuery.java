package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface AllProductsQuery {

    ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last) throws Exception;

}