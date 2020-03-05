package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.*;

public interface Mutation {

    @javax.validation.constraints.NotNull
    ProductCreatePayloadGQO productCreate(ProductCreateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductUpdatePayloadGQO productUpdate(ProductUpdateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductModelCreatePayloadGQO productModelCreate(ProductModelCreateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductModelUpdatePayloadGQO productModelUpdate(ProductModelUpdateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductOfferCreatePayloadGQO productOfferCreate(ProductOfferCreateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductOfferUpdatePayloadGQO productOfferUpdate(ProductOfferUpdateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductOfferOnlinePayloadGQO productOfferOnline(ProductOfferOnlineInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductOfferOfflinePayloadGQO productOfferOffline(ProductOfferOfflineInputGQO input) throws Exception;

}