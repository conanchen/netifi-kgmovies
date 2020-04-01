package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class UpdateCartItemInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private String id;

    private String name;

    private String description;

    private CartItemTypeGQO type;

    private Collection<String> images;

    private Integer price;

    private Integer quantity;

    public UpdateCartItemInputGQO() {
    }

    public UpdateCartItemInputGQO( String clientMutationId,  String cartId,  String id,  String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  Integer price,  Integer quantity) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.price = price;
        this.quantity = quantity;
    }

}