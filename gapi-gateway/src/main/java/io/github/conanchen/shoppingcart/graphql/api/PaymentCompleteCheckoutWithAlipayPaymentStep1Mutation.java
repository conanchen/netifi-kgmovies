package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.AlipayPaymentStep1InputGQO;
import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;

public interface PaymentCompleteCheckoutWithAlipayPaymentStep1Mutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep1(AlipayPaymentStep1InputGQO input) throws Exception;

}