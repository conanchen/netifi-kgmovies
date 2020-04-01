package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutCompleteApproveInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public CheckoutCompleteApproveInputGQO() {
    }

    public CheckoutCompleteApproveInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}