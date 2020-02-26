package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.AlipayPaymentStep2InputGQO;
import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;

public interface PaymentCompleteCheckoutWithAlipayPaymentStep2Mutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep2(AlipayPaymentStep2InputGQO input) throws Exception;

}