package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.CreditCardPaymentInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;

public interface PaymentCompleteCheckoutWithCreditCardMutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(CreditCardPaymentInputGQO input) throws Exception;

}