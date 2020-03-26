package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface PostalAddress {
    // KK
    }
    public interface Cart {
    // KK
    }
    public interface CartItem {
    // KK
    }
    public interface Currency {
    // KK
    }
    public interface CartPayload {
    // KK
    }
    public interface CartError {
    // KK
    }
    public interface AppliedGiftCard {
    // KK
    }
    public interface AvailableShippingRates {
    // KK
    }
    public interface Checkout {
    // KK
        public Connection<DiscountApplicationGQO> discountApplications(CheckoutGQO parent,Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env);
        public Connection<CheckoutItemGQO> lineItems(CheckoutGQO parent,Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env);
    }
    public interface CheckoutItem {
    // KK
    }
    public interface DiscountAllocation {
    // KK
    }
    public interface DiscountApplication {
    // KK
    }
    public interface CheckoutPayload {
    // KK
    }
    public interface CheckoutCompletePayload {
    // KK
    }
    public interface PaymentCompletePayload {
    // KK
    }
    public interface CheckoutError {
    // KK
    }
    public interface PaymentError {
    // KK
    }
    public interface Money {
    // KK
    }
    public interface Poder {
    // KK
    }
    public interface PoderItem {
    // KK
    }
    public interface ShippingRate {
    // KK
    }
}