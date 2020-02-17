package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;
import io.github.conanchen.personorg.graphql.model.PartyGQO;
import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class OrderGQO implements NodeGQO{

    private PartyGQO broker;
    private PartyGQO customer;
    private Boolean isGift;
    private java.util.Date orderDate;
    private ParcelDeliveryGQO orderDelivery;
    private String orderNumber;
    private OrderStatusGQO orderStatus;
    private Collection<OrderItemGQO> orderedItem;
    private OrganizationGQO seller;
    private Collection<ActionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String cartId;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private PostalAddressGQO shipping;
    @javax.validation.constraints.NotNull
    private PostalAddressGQO billing;
    @javax.validation.constraints.NotNull
    private MoneyGQO subTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO shippingTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO taxTotal;
    @javax.validation.constraints.NotNull
    private MoneyGQO grandTotal;
    @javax.validation.constraints.NotNull
    private Integer totalItems;
    @javax.validation.constraints.NotNull
    private Integer totalUniqueItems;
    private String notes;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String id;

    public OrderGQO() {
    }

    public OrderGQO(PartyGQO broker, PartyGQO customer, Boolean isGift, java.util.Date orderDate, ParcelDeliveryGQO orderDelivery, String orderNumber, OrderStatusGQO orderStatus, Collection<OrderItemGQO> orderedItem, OrganizationGQO seller, Collection<ActionGQO> potentialActions, String cartId, String email, PostalAddressGQO shipping, PostalAddressGQO billing, MoneyGQO subTotal, MoneyGQO shippingTotal, MoneyGQO taxTotal, MoneyGQO grandTotal, Integer totalItems, Integer totalUniqueItems, String notes, Collection<CustomAttributeGQO> attributes, java.util.Date createdAt, java.util.Date updatedAt, String id) {
        this.broker = broker;
        this.customer = customer;
        this.isGift = isGift;
        this.orderDate = orderDate;
        this.orderDelivery = orderDelivery;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.orderedItem = orderedItem;
        this.seller = seller;
        this.potentialActions = potentialActions;
        this.cartId = cartId;
        this.email = email;
        this.shipping = shipping;
        this.billing = billing;
        this.subTotal = subTotal;
        this.shippingTotal = shippingTotal;
        this.taxTotal = taxTotal;
        this.grandTotal = grandTotal;
        this.totalItems = totalItems;
        this.totalUniqueItems = totalUniqueItems;
        this.notes = notes;
        this.attributes = attributes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
    }

    public PartyGQO getBroker() {
        return broker;
    }
    public void setBroker(PartyGQO broker) {
        this.broker = broker;
    }

    public PartyGQO getCustomer() {
        return customer;
    }
    public void setCustomer(PartyGQO customer) {
        this.customer = customer;
    }

    public Boolean getIsGift() {
        return isGift;
    }
    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    public java.util.Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(java.util.Date orderDate) {
        this.orderDate = orderDate;
    }

    public ParcelDeliveryGQO getOrderDelivery() {
        return orderDelivery;
    }
    public void setOrderDelivery(ParcelDeliveryGQO orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatusGQO getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatusGQO orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Collection<OrderItemGQO> getOrderedItem() {
        return orderedItem;
    }
    public void setOrderedItem(Collection<OrderItemGQO> orderedItem) {
        this.orderedItem = orderedItem;
    }

    public OrganizationGQO getSeller() {
        return seller;
    }
    public void setSeller(OrganizationGQO seller) {
        this.seller = seller;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public PostalAddressGQO getShipping() {
        return shipping;
    }
    public void setShipping(PostalAddressGQO shipping) {
        this.shipping = shipping;
    }

    public PostalAddressGQO getBilling() {
        return billing;
    }
    public void setBilling(PostalAddressGQO billing) {
        this.billing = billing;
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

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}