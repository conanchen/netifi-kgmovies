package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutDiscountCodeApplyMutation {

    CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId) throws Exception;

}