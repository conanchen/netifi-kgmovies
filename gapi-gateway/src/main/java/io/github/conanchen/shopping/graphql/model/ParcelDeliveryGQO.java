package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.OrganizationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ParcelDeliveryGQO implements NodeGQO{

    private PostalAddressGQO deliveryAddress;
    private java.util.Date expectedArrivalFrom;
    private java.util.Date expectedArrivalUntil;
    private Collection<ProductGQO> itemShipped;
    private PostalAddressGQO originAddress;
    private OrderGQO partOfOrder;
    private OrganizationGQO provider;
    private String trackingNumber;
    private String trackingUrl;
    @javax.validation.constraints.NotNull
    private String id;

    public ParcelDeliveryGQO() {
    }

    public ParcelDeliveryGQO(PostalAddressGQO deliveryAddress, java.util.Date expectedArrivalFrom, java.util.Date expectedArrivalUntil, Collection<ProductGQO> itemShipped, PostalAddressGQO originAddress, OrderGQO partOfOrder, OrganizationGQO provider, String trackingNumber, String trackingUrl, String id) {
        this.deliveryAddress = deliveryAddress;
        this.expectedArrivalFrom = expectedArrivalFrom;
        this.expectedArrivalUntil = expectedArrivalUntil;
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

    public Collection<ProductGQO> getItemShipped() {
        return itemShipped;
    }
    public void setItemShipped(Collection<ProductGQO> itemShipped) {
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

    public OrganizationGQO getProvider() {
        return provider;
    }
    public void setProvider(OrganizationGQO provider) {
        this.provider = provider;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }
    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}