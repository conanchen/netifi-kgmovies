package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutAttributesUpdateMutation {

    CheckoutPayloadGQO checkoutAttributesUpdate(String checkoutId, CheckoutAttributesUpdateInputGQO input) throws Exception;

}