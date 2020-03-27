package io.github.conanchen.shoppingfulfill.graphql.model;

import io.github.conanchen.shoppingcart.graphql.model.PostalAddressGQO;

import java.util.Collection;

public interface FulfillDeliveryGQO {

    PostalAddressGQO getDeliveryAddress();

    Collection<DeliveryEventGQO> getDeliveryStatus();

    java.util.Date getExpectedArrivalFrom();

    java.util.Date getExpectedArrivalUntil();

}