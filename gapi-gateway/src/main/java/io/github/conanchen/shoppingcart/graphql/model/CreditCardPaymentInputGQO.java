package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCardPaymentInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public CreditCardPaymentInputGQO() {
    }

    public CreditCardPaymentInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}