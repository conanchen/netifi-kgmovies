package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CustomAttributeInputGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class AddToCartInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private String id;

    private String name;

    private String description;

    private CartItemTypeGQO type;

    private Collection<String> images;
    @lombok.NonNull
    private Integer price;

    private CurrencyInputGQO currency;

    private Integer quantity;

    private Collection<CustomAttributeInputGQO> attributes;

    public AddToCartInputGQO() {
    }

    public AddToCartInputGQO( String clientMutationId,  String cartId,  String id,  String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  Integer price,  CurrencyInputGQO currency,  Integer quantity,  Collection<CustomAttributeInputGQO> attributes) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.attributes = attributes;
    }

}