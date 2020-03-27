package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveCartItemInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private String id;

    public RemoveCartItemInputGQO() {
    }

    public RemoveCartItemInputGQO( String clientMutationId,  String cartId,  String id) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
    }

}