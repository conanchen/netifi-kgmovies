package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;

import java.util.Collection;

public class CartGQO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private CurrencyGQO currency;
    private String email;
    private Integer totalItems;
    private Integer totalUniqueItems;
    @javax.validation.constraints.NotNull
    private Collection<CartItemGQO> items;
    @javax.validation.constraints.NotNull
    private MoneyGQO subTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO shippingTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO taxTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO grandTotal;
    private Boolean isEmpty;
    private Boolean abandoned;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;
    private String notes;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public CartGQO() {
    }

    public CartGQO(String id, CurrencyGQO currency, String email, Integer totalItems, Integer totalUniqueItems, Collection<CartItemGQO> items, MoneyGQO subTotal, MoneyGQO shippingTotal, MoneyGQO taxTotal, MoneyGQO grandTotal, Boolean isEmpty, Boolean abandoned, Collection<CustomAttributeGQO> attributes, String notes, java.util.Date createdAt, java.util.Date updatedAt) {
        this.id = id;
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
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public CurrencyGQO getCurrency() {
        return currency;
    }
    public void setCurrency(CurrencyGQO currency) {
        this.currency = currency;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTotalItems() {
        return totalItems;
    }
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getTotalUniqueItems() {
        return totalUniqueItems;
    }
    public void setTotalUniqueItems(Integer totalUniqueItems) {
        this.totalUniqueItems = totalUniqueItems;
    }

    public Collection<CartItemGQO> getItems() {
        return items;
    }
    public void setItems(Collection<CartItemGQO> items) {
        this.items = items;
    }

    public MoneyGQO getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(MoneyGQO subTotal) {
        this.subTotal = subTotal;
    }

    public MoneyGQO getShippingTotal() {
        return shippingTotal;
    }
    public void setShippingTotal(MoneyGQO shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    public MoneyGQO getTaxTotal() {
        return taxTotal;
    }
    public void setTaxTotal(MoneyGQO taxTotal) {
        this.taxTotal = taxTotal;
    }

    public MoneyGQO getGrandTotal() {
        return grandTotal;
    }
    public void setGrandTotal(MoneyGQO grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Boolean getIsEmpty() {
        return isEmpty;
    }
    public void setIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Boolean getAbandoned() {
        return abandoned;
    }
    public void setAbandoned(Boolean abandoned) {
        this.abandoned = abandoned;
    }

    public Collection<CustomAttributeGQO> getAttributes() {
        return attributes;
    }
    public void setAttributes(Collection<CustomAttributeGQO> attributes) {
        this.attributes = attributes;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
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