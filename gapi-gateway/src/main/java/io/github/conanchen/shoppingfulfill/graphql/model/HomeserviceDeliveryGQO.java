package io.github.conanchen.shoppingfulfill.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.api.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class HomeserviceDeliveryGQO implements FulfillDeliveryGQO, NodeGQO{


    private PostalAddressGQO deliveryAddress;

    private Collection<DeliveryEventGQO> deliveryStatus;

    private java.util.Date expectedArrivalFrom;

    private java.util.Date expectedArrivalUntil;

    private DeliveryMethodGQO hasDeliveryMethod;

    private Collection<ProductGQO> itemShipped;

    private PostalAddressGQO originAddress;

    private PoderGQO partOfPoder;

    private PartyGQO provider;

    private java.lang.String trackingNumber;

    private java.lang.String trackingUrl;
    @javax.validation.constraints.NotNull
    private String id;

    public HomeserviceDeliveryGQO() {
    }

    public HomeserviceDeliveryGQO( PostalAddressGQO deliveryAddress,  Collection<DeliveryEventGQO> deliveryStatus,  java.util.Date expectedArrivalFrom,  java.util.Date expectedArrivalUntil,  DeliveryMethodGQO hasDeliveryMethod,  Collection<ProductGQO> itemShipped,  PostalAddressGQO originAddress,  PoderGQO partOfPoder,  PartyGQO provider,  java.lang.String trackingNumber,  java.lang.String trackingUrl,  String id) {
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;
        this.expectedArrivalFrom = expectedArrivalFrom;
        this.expectedArrivalUntil = expectedArrivalUntil;
        this.hasDeliveryMethod = hasDeliveryMethod;
        this.itemShipped = itemShipped;
        this.originAddress = originAddress;
        this.partOfPoder = partOfPoder;
        this.provider = provider;
        this.trackingNumber = trackingNumber;
        this.trackingUrl = trackingUrl;
        this.id = id;
    }

}