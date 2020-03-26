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
public class CartItemGQO {

    @javax.validation.constraints.NotNull
    private String id;

    private String name;

    private String description;
    @javax.validation.constraints.NotNull
    private CartItemTypeGQO type;

    private Collection<String> images;
    @javax.validation.constraints.NotNull
    private MoneyGQO unitTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO lineTotal;
    @javax.validation.constraints.NotNull
    private Integer quantity;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public CartItemGQO() {
    }

    public CartItemGQO( String id,  String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  MoneyGQO unitTotal,  MoneyGQO lineTotal,  Integer quantity,  Collection<CustomAttributeGQO> attributes,  java.util.Date createdAt,  java.util.Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.unitTotal = unitTotal;
        this.lineTotal = lineTotal;
        this.quantity = quantity;
        this.attributes = attributes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}