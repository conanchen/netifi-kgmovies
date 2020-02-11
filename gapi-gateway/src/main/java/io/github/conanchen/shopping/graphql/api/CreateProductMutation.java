package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface CreateProductMutation {

    @javax.validation.constraints.NotNull
    ProductGQO createProduct(String name) throws Exception;

}