package io.github.conanchen.shoppingcart.graphql.api;

import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface Query {
// KK
    CartGQO cart(String id, CurrencyInputGQO currency, DataFetchingEnvironment env) throws Exception;
    PoderGQO poder(String id, String poderID, DataFetchingEnvironment env) throws Exception;
    CheckoutGQO checkout(String id, String checkoutID, DataFetchingEnvironment env) throws Exception;
    PostalAddressGQO postalAddress(String id, String paID, DataFetchingEnvironment env) throws Exception;
}