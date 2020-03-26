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

public interface FulfillDeliveryGQO {

    PostalAddressGQO getDeliveryAddress();

    Collection<DeliveryEventGQO> getDeliveryStatus();

    java.util.Date getExpectedArrivalFrom();

    java.util.Date getExpectedArrivalUntil();

}