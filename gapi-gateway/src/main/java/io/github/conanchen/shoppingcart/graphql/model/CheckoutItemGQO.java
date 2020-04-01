package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.shoppingdoor.graphql.model.ShoppingableGQO;
import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CheckoutItemGQO implements NodeGQO{

    @lombok.NonNull
    private Collection<CustomAttributeGQO> customAttributes;
    @lombok.NonNull
    private Collection<DiscountAllocationGQO> discountAllocations;
    @lombok.NonNull
    private Integer quantity;
    @lombok.NonNull
    private String title;

    private ShoppingableGQO variant;
    @lombok.NonNull
    private String id;

    public CheckoutItemGQO() {
    }

    public CheckoutItemGQO( Collection<CustomAttributeGQO> customAttributes,  Collection<DiscountAllocationGQO> discountAllocations,  Integer quantity,  String title,  ShoppingableGQO variant,  String id) {
        this.customAttributes = customAttributes;
        this.discountAllocations = discountAllocations;
        this.quantity = quantity;
        this.title = title;
        this.variant = variant;
        this.id = id;
    }

}