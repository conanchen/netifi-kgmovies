package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutCompleteRequestInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public CheckoutCompleteRequestInputGQO() {
    }

    public CheckoutCompleteRequestInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}