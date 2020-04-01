package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeixinPaymentStep1InputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public WeixinPaymentStep1InputGQO() {
    }

    public WeixinPaymentStep1InputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}