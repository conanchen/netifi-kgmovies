package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutEmailUpdateMutation {

    CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email) throws Exception;

}