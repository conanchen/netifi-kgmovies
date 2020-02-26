package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.PostalAddressInputGQO;

public interface CheckoutShippingAddressUpdateMutation {

    CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress, String checkoutId) throws Exception;

}