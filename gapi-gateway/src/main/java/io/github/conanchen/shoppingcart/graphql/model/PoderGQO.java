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
public class PoderGQO implements NodeGQO{


    private PartyGQO broker;

    private PartyGQO customer;

    private Boolean isGift;

    private java.util.Date poderDate;

    private FulfillDeliveryGQO poderDelivery;

    private String poderNumber;

    private PoderStatusGQO poderStatus;

    private Collection<PoderItemGQO> poderedItem;

    private OrganizationGQO seller;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private String id;

    public PoderGQO() {
    }

    public PoderGQO( PartyGQO broker,  PartyGQO customer,  Boolean isGift,  java.util.Date poderDate,  FulfillDeliveryGQO poderDelivery,  String poderNumber,  PoderStatusGQO poderStatus,  Collection<PoderItemGQO> poderedItem,  OrganizationGQO seller,  Collection<ActionGQO> potentialActions,  String id) {
        this.broker = broker;
        this.customer = customer;
        this.isGift = isGift;
        this.poderDate = poderDate;
        this.poderDelivery = poderDelivery;
        this.poderNumber = poderNumber;
        this.poderStatus = poderStatus;
        this.poderedItem = poderedItem;
        this.seller = seller;
        this.potentialActions = potentialActions;
        this.id = id;
    }

}