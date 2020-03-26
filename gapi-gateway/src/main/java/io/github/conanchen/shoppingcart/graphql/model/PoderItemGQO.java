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
public class PoderItemGQO implements NodeGQO{


    private PoderGQO partOfPoder;

    private FulfillDeliveryGQO poderDelivery;

    private String poderItemNumber;

    private PoderStatusGQO poderItemStatus;

    private Integer poderQuantity;

    private ShoppingableGQO poderedItem;

    private Collection<ActionGQO> potentialActions;
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
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;
    @javax.validation.constraints.NotNull
    private String id;

    public PoderItemGQO() {
    }

    public PoderItemGQO( PoderGQO partOfPoder,  FulfillDeliveryGQO poderDelivery,  String poderItemNumber,  PoderStatusGQO poderItemStatus,  Integer poderQuantity,  ShoppingableGQO poderedItem,  Collection<ActionGQO> potentialActions,  CartItemTypeGQO type,  Collection<String> images,  MoneyGQO unitTotal,  MoneyGQO lineTotal,  Integer quantity,  java.util.Date createdAt,  java.util.Date updatedAt,  Collection<CustomAttributeGQO> attributes,  String id) {
        this.partOfPoder = partOfPoder;
        this.poderDelivery = poderDelivery;
        this.poderItemNumber = poderItemNumber;
        this.poderItemStatus = poderItemStatus;
        this.poderQuantity = poderQuantity;
        this.poderedItem = poderedItem;
        this.potentialActions = potentialActions;
        this.type = type;
        this.images = images;
        this.unitTotal = unitTotal;
        this.lineTotal = lineTotal;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.attributes = attributes;
        this.id = id;
    }

}