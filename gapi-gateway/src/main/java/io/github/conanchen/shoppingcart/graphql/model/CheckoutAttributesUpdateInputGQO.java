package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutAttributesUpdateInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public CheckoutAttributesUpdateInputGQO() {
    }

    public CheckoutAttributesUpdateInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}