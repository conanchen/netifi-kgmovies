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
public class CheckoutInputGQO {


    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String cartId;

    private String email;
    @javax.validation.constraints.NotNull
    private PostalAddressInputGQO shipping;

    private PostalAddressInputGQO billing;

    public CheckoutInputGQO() {
    }

    public CheckoutInputGQO( String clientMutationId,  String cartId,  String email,  PostalAddressInputGQO shipping,  PostalAddressInputGQO billing) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.email = email;
        this.shipping = shipping;
        this.billing = billing;
    }

}