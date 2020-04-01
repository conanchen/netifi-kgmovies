package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateItemQuantityInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private String id;
    @lombok.NonNull
    private Integer by;

    public UpdateItemQuantityInputGQO() {
    }

    public UpdateItemQuantityInputGQO( String clientMutationId,  String cartId,  String id,  Integer by) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
        this.by = by;
    }

}