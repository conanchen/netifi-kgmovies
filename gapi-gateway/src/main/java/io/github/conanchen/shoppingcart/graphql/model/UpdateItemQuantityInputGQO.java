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
public class UpdateItemQuantityInputGQO {


    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String cartId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Integer by;

    public UpdateItemQuantityInputGQO() {
    }

    public UpdateItemQuantityInputGQO( String clientMutationId,  String cartId,  String id,  Integer by) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
        this.by = by;
    }

}