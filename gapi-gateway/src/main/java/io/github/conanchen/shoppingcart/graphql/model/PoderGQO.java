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
    private String cartId;
    @lombok.NonNull
    private String email;
    @lombok.NonNull
    private PostalAddressGQO shipping;
    @lombok.NonNull
    private PostalAddressGQO billing;
    @lombok.NonNull
    private MoneyGQO subTotal;
    @lombok.NonNull
    private MoneyGQO shippingTotal;
    @lombok.NonNull
    private MoneyGQO taxTotal;
    @lombok.NonNull
    private MoneyGQO grandTotal;
    @lombok.NonNull
    private Integer totalItems;
    @lombok.NonNull
    private Integer totalUniqueItems;

    private String notes;
    @lombok.NonNull
    private Collection<CustomAttributeGQO> attributes;
    @lombok.NonNull
    private java.util.Date createdAt;
    @lombok.NonNull
    private java.util.Date updatedAt;
    @lombok.NonNull
    private String id;

    public PoderGQO() {
    }

    public PoderGQO( PartyGQO broker,  PartyGQO customer,  Boolean isGift,  java.util.Date poderDate,  FulfillDeliveryGQO poderDelivery,  String poderNumber,  PoderStatusGQO poderStatus,  Collection<PoderItemGQO> poderedItem,  OrganizationGQO seller,  Collection<ActionGQO> potentialActions,  String cartId,  String email,  PostalAddressGQO shipping,  PostalAddressGQO billing,  MoneyGQO subTotal,  MoneyGQO shippingTotal,  MoneyGQO taxTotal,  MoneyGQO grandTotal,  Integer totalItems,  Integer totalUniqueItems,  String notes,  Collection<CustomAttributeGQO> attributes,  java.util.Date createdAt,  java.util.Date updatedAt,  String id) {
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
        this.cartId = cartId;
        this.email = email;
        this.shipping = shipping;
        this.billing = billing;
        this.subTotal = subTotal;
        this.shippingTotal = shippingTotal;
        this.taxTotal = taxTotal;
        this.grandTotal = grandTotal;
        this.totalItems = totalItems;
        this.totalUniqueItems = totalUniqueItems;
        this.notes = notes;
        this.attributes = attributes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
    }

}