package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutCreateInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public CheckoutCreateInputGQO() {
    }

    public CheckoutCreateInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}