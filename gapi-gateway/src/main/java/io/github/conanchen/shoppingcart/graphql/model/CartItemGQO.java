package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;

import java.util.Collection;

public class CartItemGQO {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private CartItemTypeGQO type;
    private Collection<String> images;
    @javax.validation.constraints.NotNull
    private MoneyGQO unitTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO lineTotal;
    @javax.validation.constraints.NotNull
    private Integer quantity;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public CartItemGQO() {
    }

    public CartItemGQO(String id, String name, String description, CartItemTypeGQO type, Collection<String> images, MoneyGQO unitTotal, MoneyGQO lineTotal, Integer quantity, Collection<CustomAttributeGQO> attributes, java.util.Date createdAt, java.util.Date updatedAt) {
        this.id = id;
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
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public CartItemTypeGQO getType() {
        return type;
    }
    public void setType(CartItemTypeGQO type) {
        this.type = type;
    }

    public Collection<String> getImages() {
        return images;
    }
    public void setImages(Collection<String> images) {
        this.images = images;
    }

    public MoneyGQO getUnitTotal() {
        return unitTotal;
    }
    public void setUnitTotal(MoneyGQO unitTotal) {
        this.unitTotal = unitTotal;
    }

    public MoneyGQO getLineTotal() {
        return lineTotal;
    }
    public void setLineTotal(MoneyGQO lineTotal) {
        this.lineTotal = lineTotal;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Collection<CustomAttributeGQO> getAttributes() {
        return attributes;
    }
    public void setAttributes(Collection<CustomAttributeGQO> attributes) {
        this.attributes = attributes;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}