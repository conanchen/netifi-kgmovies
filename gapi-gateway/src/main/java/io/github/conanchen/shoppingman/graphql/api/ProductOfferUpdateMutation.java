package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductOfferUpdateInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductOfferUpdatePayloadGQO;

public interface ProductOfferUpdateMutation {

    @javax.validation.constraints.NotNull
    ProductOfferUpdatePayloadGQO productOfferUpdate(ProductOfferUpdateInputGQO input) throws Exception;

}