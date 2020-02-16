package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutQuery {

    CheckoutGQO checkout(String id, String checkoutID) throws Exception;

}