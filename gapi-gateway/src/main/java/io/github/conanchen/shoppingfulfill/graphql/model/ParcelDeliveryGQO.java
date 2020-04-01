package io.github.conanchen.shoppingfulfill.graphql.model;

import io.github.conanchen.organization.graphql.model.PartyGQO;
import io.github.conanchen.shoppingcart.graphql.model.PoderGQO;
import io.github.conanchen.shoppingcart.graphql.model.PostalAddressGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ParcelDeliveryGQO implements FulfillDeliveryGQO, NodeGQO{


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

    public ParcelDeliveryGQO() {
    }

    public ParcelDeliveryGQO( PostalAddressGQO deliveryAddress,  Collection<DeliveryEventGQO> deliveryStatus,  java.util.Date expectedArrivalFrom,  java.util.Date expectedArrivalUntil,  DeliveryMethodGQO hasDeliveryMethod,  Collection<ProductGQO> itemShipped,  PostalAddressGQO originAddress,  PoderGQO partOfPoder,  PartyGQO provider,  java.lang.String trackingNumber,  java.lang.String trackingUrl,  String id) {
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