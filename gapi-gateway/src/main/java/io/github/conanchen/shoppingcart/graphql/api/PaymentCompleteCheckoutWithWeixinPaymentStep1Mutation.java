package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.WeixinPaymentStep1InputGQO;

public interface PaymentCompleteCheckoutWithWeixinPaymentStep1Mutation {

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep1(WeixinPaymentStep1InputGQO input) throws Exception;

}