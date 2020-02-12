package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.ActionUnionGQO;
import io.github.conanchen.message.graphql.model.OrganizationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class OrderGQO implements NodeGQO{

    private OrganizationGQO broker;
    private OrganizationGQO customer;
    private Boolean isGift;
    private java.util.Date orderDate;
    private ParcelDeliveryGQO orderDelivery;
    private String orderNumber;
    private OrderStatusGQO orderStatus;
    private Collection<OrderItemGQO> orderedItem;
    private OrganizationGQO seller;
    private Collection<ActionUnionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String id;

    public OrderGQO() {
    }

    public OrderGQO(OrganizationGQO broker, OrganizationGQO customer, Boolean isGift, java.util.Date orderDate, ParcelDeliveryGQO orderDelivery, String orderNumber, OrderStatusGQO orderStatus, Collection<OrderItemGQO> orderedItem, OrganizationGQO seller, Collection<ActionUnionGQO> potentialActions, String id) {
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
        this.id = id;
    }

    public OrganizationGQO getBroker() {
        return broker;
    }
    public void setBroker(OrganizationGQO broker) {
        this.broker = broker;
    }

    public OrganizationGQO getCustomer() {
        return customer;
    }
    public void setCustomer(OrganizationGQO customer) {
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

    public Collection<ActionUnionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionUnionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}