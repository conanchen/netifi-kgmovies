package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface PaymentCompleteCheckoutWithTokenizedPaymentMutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(TokenizedPaymentInputGQO input) throws Exception;

}