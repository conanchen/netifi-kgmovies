package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductOfferCreateInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductOfferCreatePayloadGQO;

public interface ProductOfferCreateMutation {

    @javax.validation.constraints.NotNull
    ProductOfferCreatePayloadGQO productOfferCreate(ProductOfferCreateInputGQO input) throws Exception;

}