package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.TokenizedPaymentInputGQO;

public interface PaymentCompleteCheckoutWithTokenizedPaymentMutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(TokenizedPaymentInputGQO input) throws Exception;

}