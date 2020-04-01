package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CartGQO implements NodeGQO{

    @lombok.NonNull
    private CurrencyGQO currency;

    private String email;

    private Integer totalItems;

    private Integer totalUniqueItems;
    @lombok.NonNull
    private Collection<CartItemGQO> items;
    @lombok.NonNull
    private MoneyGQO subTotal;
    @lombok.NonNull
    private MoneyGQO shippingTotal;
    @lombok.NonNull
    private MoneyGQO taxTotal;
    @lombok.NonNull
    private MoneyGQO grandTotal;

    private Boolean isEmpty;

    private Boolean abandoned;
    @lombok.NonNull
    private Collection<CustomAttributeGQO> attributes;

    private String notes;
    @lombok.NonNull
    private java.util.Date createdAt;
    @lombok.NonNull
    private java.util.Date updatedAt;
    @lombok.NonNull
    private String id;

    public CartGQO() {
    }

    public CartGQO( CurrencyGQO currency,  String email,  Integer totalItems,  Integer totalUniqueItems,  Collection<CartItemGQO> items,  MoneyGQO subTotal,  MoneyGQO shippingTotal,  MoneyGQO taxTotal,  MoneyGQO grandTotal,  Boolean isEmpty,  Boolean abandoned,  Collection<CustomAttributeGQO> attributes,  String notes,  java.util.Date createdAt,  java.util.Date updatedAt,  String id) {
        this.currency = currency;
        this.email = email;
        this.totalItems = totalItems;
        this.totalUniqueItems = totalUniqueItems;
        this.items = items;
        this.subTotal = subTotal;
        this.shippingTotal = shippingTotal;
        this.taxTotal = taxTotal;
        this.grandTotal = grandTotal;
        this.isEmpty = isEmpty;
        this.abandoned = abandoned;
        this.attributes = attributes;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
    }

}