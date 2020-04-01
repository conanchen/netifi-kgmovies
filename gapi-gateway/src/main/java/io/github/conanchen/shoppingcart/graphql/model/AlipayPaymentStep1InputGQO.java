package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlipayPaymentStep1InputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public AlipayPaymentStep1InputGQO() {
    }

    public AlipayPaymentStep1InputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}