package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutCustomerDisassociateMutation {

    CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId) throws Exception;

}