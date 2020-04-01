package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductOfferOnlineInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductOfferOnlinePayloadGQO;

public interface ProductOfferOnlineMutation {

    @javax.validation.constraints.NotNull
    ProductOfferOnlinePayloadGQO productOfferOnline(ProductOfferOnlineInputGQO input) throws Exception;

}