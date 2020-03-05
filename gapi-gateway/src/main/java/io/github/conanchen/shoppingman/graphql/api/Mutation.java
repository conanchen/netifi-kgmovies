package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.*;
import java.util.*;

public interface Mutation {

    @javax.validation.constraints.NotNull
    ProductCreatePayloadGQO productCreate(ProductCreateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductUpdatePayloadGQO productUpdate(ProductUpdateInputGQO input) throws Exception;

}