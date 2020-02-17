package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface Query {

    CartGQO cart(String id, CurrencyInputGQO currency) throws Exception;

    OrderGQO order(String id, String orderID) throws Exception;

    CheckoutGQO checkout(String id, String checkoutID) throws Exception;

    PostalAddressGQO postalAddress(String id, String paID) throws Exception;

}