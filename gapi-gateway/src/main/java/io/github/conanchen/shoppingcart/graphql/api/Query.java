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

public interface Query {
// KK
    CartGQO cart(String id, CurrencyInputGQO currency, DataFetchingEnvironment env) throws Exception;
    PoderGQO poder(String id, String poderID, DataFetchingEnvironment env) throws Exception;
    CheckoutGQO checkout(String id, String checkoutID, DataFetchingEnvironment env) throws Exception;
    PostalAddressGQO postalAddress(String id, String paID, DataFetchingEnvironment env) throws Exception;
}