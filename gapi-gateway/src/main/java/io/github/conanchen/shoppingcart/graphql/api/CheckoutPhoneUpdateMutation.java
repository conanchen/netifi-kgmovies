package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutPhoneUpdateMutation {

    CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email) throws Exception;

}