package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import io.github.conanchen.organization.graphql.model.PartyGQO;
import io.github.conanchen.shoppingfulfill.graphql.model.FulfillDeliveryGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

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