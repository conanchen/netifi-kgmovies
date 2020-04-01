package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmptyCartInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public EmptyCartInputGQO() {
    }

    public EmptyCartInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}