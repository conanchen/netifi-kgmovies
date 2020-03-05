package io.github.conanchen.fulfill.graphql.model;

import java.util.*;
import io.github.conanchen.fulfill.graphql.api.*;
import io.github.conanchen.shoppingcart.graphql.model.PostalAddressGQO;

public interface PSDeliveryGQO {

    PostalAddressGQO getDeliveryAddress();

    Collection<DeliveryEventGQO> getDeliveryStatus();

    java.util.Date getExpectedArrivalFrom();

    java.util.Date getExpectedArrivalUntil();

}