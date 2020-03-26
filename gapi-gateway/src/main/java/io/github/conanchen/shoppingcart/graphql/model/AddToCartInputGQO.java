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
public class AddToCartInputGQO {


    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String cartId;
    @javax.validation.constraints.NotNull
    private String id;

    private String name;

    private String description;

    private CartItemTypeGQO type;

    private Collection<String> images;
    @javax.validation.constraints.NotNull
    private Integer price;

    private CurrencyInputGQO currency;

    private Integer quantity;

    private Collection<CustomAttributeInputGQO> attributes;

    public AddToCartInputGQO() {
    }

    public AddToCartInputGQO( String clientMutationId,  String cartId,  String id,  String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  Integer price,  CurrencyInputGQO currency,  Integer quantity,  Collection<CustomAttributeInputGQO> attributes) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.attributes = attributes;
    }

}