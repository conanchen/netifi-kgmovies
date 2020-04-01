package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeixinPaymentStep2InputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public WeixinPaymentStep2InputGQO() {
    }

    public WeixinPaymentStep2InputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}