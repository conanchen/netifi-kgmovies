package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class PaymentCompletePayloadGQO {


    private PoderGQO poder;
    @lombok.NonNull
    private Collection<PaymentErrorGQO> paymentErrors;

    public PaymentCompletePayloadGQO() {
    }

    public PaymentCompletePayloadGQO( PoderGQO poder,  Collection<PaymentErrorGQO> paymentErrors) {
        this.poder = poder;
        this.paymentErrors = paymentErrors;
    }

}