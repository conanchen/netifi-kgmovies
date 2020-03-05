package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.StoreUpdateInputGQO;
import io.github.conanchen.place.graphql.model.StoreUpdatePayloadGQO;

public interface StoreUpdateMutation {

    @javax.validation.constraints.NotNull
    StoreUpdatePayloadGQO storeUpdate(StoreUpdateInputGQO input) throws Exception;

}