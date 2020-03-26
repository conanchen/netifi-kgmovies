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
public class PoderItemGQO implements NodeGQO{


    private PoderGQO partOfPoder;

    private FulfillDeliveryGQO poderDelivery;

    private String poderItemNumber;

    private PoderStatusGQO poderItemStatus;

    private Integer poderQuantity;

    private ShoppingableGQO poderedItem;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private String id;

    public PoderItemGQO() {
    }

    public PoderItemGQO( PoderGQO partOfPoder,  FulfillDeliveryGQO poderDelivery,  String poderItemNumber,  PoderStatusGQO poderItemStatus,  Integer poderQuantity,  ShoppingableGQO poderedItem,  Collection<ActionGQO> potentialActions,  String id) {
        this.partOfPoder = partOfPoder;
        this.poderDelivery = poderDelivery;
        this.poderItemNumber = poderItemNumber;
        this.poderItemStatus = poderItemStatus;
        this.poderQuantity = poderQuantity;
        this.poderedItem = poderedItem;
        this.potentialActions = potentialActions;
        this.id = id;
    }

}