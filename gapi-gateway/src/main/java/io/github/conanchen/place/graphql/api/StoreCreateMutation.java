package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface StoreCreateMutation {

    @javax.validation.constraints.NotNull
    StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input) throws Exception;

}