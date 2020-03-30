package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class StoreCreatePayloadGQO {


    private StoreGQO store;

    private ActionGQO action;
    @lombok.NonNull
    private Collection<StoreCreateErrorGQO> storeCreateErrors;

    public StoreCreatePayloadGQO() {
    }

    public StoreCreatePayloadGQO( StoreGQO store,  ActionGQO action,  Collection<StoreCreateErrorGQO> storeCreateErrors) {
        this.store = store;
        this.action = action;
        this.storeCreateErrors = storeCreateErrors;
    }

}