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
public class CartGQO implements ACLableGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private CurrencyGQO currency;

    private String email;

    private Integer totalItems;

    private Integer totalUniqueItems;
    @javax.validation.constraints.NotNull
    private Collection<CartItemGQO> items;
    @javax.validation.constraints.NotNull
    private MoneyGQO subTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO shippingTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO taxTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO grandTotal;

    private Boolean isEmpty;

    private Boolean abandoned;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;

    private String notes;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    private ACLMetadataGQO hasAclmetadata;
    @javax.validation.constraints.NotNull
    private String id;

    public CartGQO() {
    }

    public CartGQO( CurrencyGQO currency,  String email,  Integer totalItems,  Integer totalUniqueItems,  Collection<CartItemGQO> items,  MoneyGQO subTotal,  MoneyGQO shippingTotal,  MoneyGQO taxTotal,  MoneyGQO grandTotal,  Boolean isEmpty,  Boolean abandoned,  Collection<CustomAttributeGQO> attributes,  String notes,  java.util.Date createdAt,  java.util.Date updatedAt,  ACLMetadataGQO hasAclmetadata,  String id) {
        this.currency = currency;
        this.email = email;
        this.totalItems = totalItems;
        this.totalUniqueItems = totalUniqueItems;
        this.items = items;
        this.subTotal = subTotal;
        this.shippingTotal = shippingTotal;
        this.taxTotal = taxTotal;
        this.grandTotal = grandTotal;
        this.isEmpty = isEmpty;
        this.abandoned = abandoned;
        this.attributes = attributes;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.hasAclmetadata = hasAclmetadata;
        this.id = id;
    }

}