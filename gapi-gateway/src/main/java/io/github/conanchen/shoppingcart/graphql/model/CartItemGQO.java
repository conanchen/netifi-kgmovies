package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CartItemGQO implements NodeGQO{


    private String name;

    private String description;
    @lombok.NonNull
    private CartItemTypeGQO type;

    private Collection<String> images;
    @lombok.NonNull
    private MoneyGQO unitTotal;
    @lombok.NonNull
    private MoneyGQO lineTotal;
    @lombok.NonNull
    private Integer quantity;
    @lombok.NonNull
    private Collection<CustomAttributeGQO> attributes;
    @lombok.NonNull
    private java.util.Date createdAt;
    @lombok.NonNull
    private java.util.Date updatedAt;
    @lombok.NonNull
    private String id;

    public CartItemGQO() {
    }

    public CartItemGQO( String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  MoneyGQO unitTotal,  MoneyGQO lineTotal,  Integer quantity,  Collection<CustomAttributeGQO> attributes,  java.util.Date createdAt,  java.util.Date updatedAt,  String id) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.unitTotal = unitTotal;
        this.lineTotal = lineTotal;
        this.quantity = quantity;
        this.attributes = attributes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
    }

}