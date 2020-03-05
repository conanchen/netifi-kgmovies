package io.github.conanchen.fulfill.graphql.model;

import java.util.*;
import io.github.conanchen.fulfill.graphql.api.*;

public class ParcelDeliveryGQO implements PSDeliveryGQO, NodeGQO{

    private PostalAddressGQO deliveryAddress;
    private Collection<DeliveryEventGQO> deliveryStatus;
    private java.util.Date expectedArrivalFrom;
    private java.util.Date expectedArrivalUntil;
    private DeliveryMethodGQO hasDeliveryMethod;
    private ProductGQO itemShipped;
    private PostalAddressGQO originAddress;
    private OrderGQO partOfOrder;
    private PartyGQO provider;
    private java.lang.String trackingNumber;
    private java.lang.String trackingUrl;
    @javax.validation.constraints.NotNull
    private String id;

    public ParcelDeliveryGQO() {
    }

    public ParcelDeliveryGQO(PostalAddressGQO deliveryAddress, Collection<DeliveryEventGQO> deliveryStatus, java.util.Date expectedArrivalFrom, java.util.Date expectedArrivalUntil, DeliveryMethodGQO hasDeliveryMethod, ProductGQO itemShipped, PostalAddressGQO originAddress, OrderGQO partOfOrder, PartyGQO provider, java.lang.String trackingNumber, java.lang.String trackingUrl, String id) {
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;
        this.expectedArrivalFrom = expectedArrivalFrom;
        this.expectedArrivalUntil = expectedArrivalUntil;
        this.hasDeliveryMethod = hasDeliveryMethod;
        this.itemShipped = itemShipped;
        this.originAddress = originAddress;
        this.partOfOrder = partOfOrder;
        this.provider = provider;
        this.trackingNumber = trackingNumber;
        this.trackingUrl = trackingUrl;
        this.id = id;
    }

    public PostalAddressGQO getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(PostalAddressGQO deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Collection<DeliveryEventGQO> getDeliveryStatus() {
        return deliveryStatus;
    }
    public void setDeliveryStatus(Collection<DeliveryEventGQO> deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public java.util.Date getExpectedArrivalFrom() {
        return expectedArrivalFrom;
    }
    public void setExpectedArrivalFrom(java.util.Date expectedArrivalFrom) {
        this.expectedArrivalFrom = expectedArrivalFrom;
    }

    public java.util.Date getExpectedArrivalUntil() {
        return expectedArrivalUntil;
    }
    public void setExpectedArrivalUntil(java.util.Date expectedArrivalUntil) {
        this.expectedArrivalUntil = expectedArrivalUntil;
    }

    public DeliveryMethodGQO getHasDeliveryMethod() {
        return hasDeliveryMethod;
    }
    public void setHasDeliveryMethod(DeliveryMethodGQO hasDeliveryMethod) {
        this.hasDeliveryMethod = hasDeliveryMethod;
    }

    public ProductGQO getItemShipped() {
        return itemShipped;
    }
    public void setItemShipped(ProductGQO itemShipped) {
        this.itemShipped = itemShipped;
    }

    public PostalAddressGQO getOriginAddress() {
        return originAddress;
    }
    public void setOriginAddress(PostalAddressGQO originAddress) {
        this.originAddress = originAddress;
    }

    public OrderGQO getPartOfOrder() {
        return partOfOrder;
    }
    public void setPartOfOrder(OrderGQO partOfOrder) {
        this.partOfOrder = partOfOrder;
    }

    public PartyGQO getProvider() {
        return provider;
    }
    public void setProvider(PartyGQO provider) {
        this.provider = provider;
    }

    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public java.lang.String getTrackingUrl() {
        return trackingUrl;
    }
    public void setTrackingUrl(java.lang.String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}