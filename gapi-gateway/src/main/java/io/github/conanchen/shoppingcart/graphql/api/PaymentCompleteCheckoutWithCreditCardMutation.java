package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface PaymentCompleteCheckoutWithCreditCardMutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(CreditCardPaymentInputGQO input) throws Exception;

}