package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CheckoutDiscountCodeRemoveMutation {

    CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId) throws Exception;

}