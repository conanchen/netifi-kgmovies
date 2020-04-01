package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlipayPaymentStep2InputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public AlipayPaymentStep2InputGQO() {
    }

    public AlipayPaymentStep2InputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}