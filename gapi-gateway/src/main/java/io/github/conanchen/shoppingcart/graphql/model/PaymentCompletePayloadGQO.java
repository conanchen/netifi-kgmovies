package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class PaymentCompletePayloadGQO {

    private OrderGQO order;
    @javax.validation.constraints.NotNull
    private Collection<PaymentErrorGQO> paymentErrors;

    public PaymentCompletePayloadGQO() {
    }

    public PaymentCompletePayloadGQO(OrderGQO order, Collection<PaymentErrorGQO> paymentErrors) {
        this.order = order;
        this.paymentErrors = paymentErrors;
    }

    public OrderGQO getOrder() {
        return order;
    }
    public void setOrder(OrderGQO order) {
        this.order = order;
    }

    public Collection<PaymentErrorGQO> getPaymentErrors() {
        return paymentErrors;
    }
    public void setPaymentErrors(Collection<PaymentErrorGQO> paymentErrors) {
        this.paymentErrors = paymentErrors;
    }

}