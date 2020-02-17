package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutShippingAddressUpdateMutation {

    CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress, String checkoutId) throws Exception;

}