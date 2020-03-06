package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.shoppingdoor.graphql.model.ShoppingableGQO;
import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class CheckoutLineItemGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> customAttributes;
    @javax.validation.constraints.NotNull
    private Collection<DiscountAllocationGQO> discountAllocations;
    @javax.validation.constraints.NotNull
    private Integer quantity;
    @javax.validation.constraints.NotNull
    private String title;
    private ShoppingableGQO variant;
    @javax.validation.constraints.NotNull
    private String id;

    public CheckoutLineItemGQO() {
    }

    public CheckoutLineItemGQO(Collection<CustomAttributeGQO> customAttributes, Collection<DiscountAllocationGQO> discountAllocations, Integer quantity, String title, ShoppingableGQO variant, String id) {
        this.customAttributes = customAttributes;
        this.discountAllocations = discountAllocations;
        this.quantity = quantity;
        this.title = title;
        this.variant = variant;
        this.id = id;
    }

    public Collection<CustomAttributeGQO> getCustomAttributes() {
        return customAttributes;
    }
    public void setCustomAttributes(Collection<CustomAttributeGQO> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public Collection<DiscountAllocationGQO> getDiscountAllocations() {
        return discountAllocations;
    }
    public void setDiscountAllocations(Collection<DiscountAllocationGQO> discountAllocations) {
        this.discountAllocations = discountAllocations;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public ShoppingableGQO getVariant() {
        return variant;
    }

    public void setVariant(ShoppingableGQO variant) {
        this.variant = variant;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}