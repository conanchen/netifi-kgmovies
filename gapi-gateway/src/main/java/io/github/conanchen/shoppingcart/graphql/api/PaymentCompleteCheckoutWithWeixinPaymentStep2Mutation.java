package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.WeixinPaymentStep2InputGQO;

public interface PaymentCompleteCheckoutWithWeixinPaymentStep2Mutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep2(WeixinPaymentStep2InputGQO input) throws Exception;

}