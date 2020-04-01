package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutCreatePlusPoderInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public CheckoutCreatePlusPoderInputGQO() {
    }

    public CheckoutCreatePlusPoderInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}