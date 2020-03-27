package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.ProductOfferOfflineInputGQO;
import io.github.conanchen.shoppingman.graphql.model.ProductOfferOfflinePayloadGQO;

public interface ProductOfferOfflineMutation {

    @javax.validation.constraints.NotNull
    ProductOfferOfflinePayloadGQO productOfferOffline(ProductOfferOfflineInputGQO input) throws Exception;

}