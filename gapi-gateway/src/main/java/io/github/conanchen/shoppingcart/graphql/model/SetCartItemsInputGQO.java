package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class SetCartItemsInputGQO {

    @javax.validation.constraints.NotNull
    private String cartId;
    @javax.validation.constraints.NotNull
    private Collection<SetCartItemInputGQO> items;

    public SetCartItemsInputGQO() {
    }

    public SetCartItemsInputGQO( String cartId,  Collection<SetCartItemInputGQO> items) {
        this.cartId = cartId;
        this.items = items;
    }

}