package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Mutation {
// KK
    @lombok.NonNull
    StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    StoreUpdatePayloadGQO storeUpdate(StoreUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
}