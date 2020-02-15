package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutCreatePlusOrderMutation {

    CheckoutPayloadGQO checkoutCreatePlusOrder(CheckoutCreatePlusOrderInputGQO input) throws Exception;

}