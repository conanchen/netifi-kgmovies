package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreCreateInputGQO;
import io.github.conanchen.place.graphql.model.StoreCreatePayloadGQO;
import io.github.conanchen.place.graphql.model.StoreUpdateInputGQO;
import io.github.conanchen.place.graphql.model.StoreUpdatePayloadGQO;

public interface Mutation {

    @javax.validation.constraints.NotNull
    StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    StoreUpdatePayloadGQO storeUpdate(StoreUpdateInputGQO input) throws Exception;

}