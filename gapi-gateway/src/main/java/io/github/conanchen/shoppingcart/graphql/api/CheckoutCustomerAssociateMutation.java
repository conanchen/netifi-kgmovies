package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutCustomerAssociateMutation {

    CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken) throws Exception;

}