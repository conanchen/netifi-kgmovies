package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreCreateInputGQO;
import io.github.conanchen.place.graphql.model.StoreCreatePayloadGQO;

public interface StoreCreateMutation {

    @javax.validation.constraints.NotNull
    StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input) throws Exception;

}