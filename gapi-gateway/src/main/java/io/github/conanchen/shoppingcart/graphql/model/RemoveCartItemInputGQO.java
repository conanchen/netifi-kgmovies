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
import lombok.NonNull;

@Data
@Builder
public class RemoveCartItemInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private String id;

    public RemoveCartItemInputGQO() {
    }

    public RemoveCartItemInputGQO( String clientMutationId,  String cartId,  String id) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
    }

}