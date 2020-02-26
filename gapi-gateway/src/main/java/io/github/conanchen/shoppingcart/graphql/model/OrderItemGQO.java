package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OrderableThingGQO;
import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class OrderItemGQO implements NodeGQO{

    private OrderGQO partOfOrder;
    private ParcelDeliveryGQO orderDelivery;
    private String orderItemNumber;
    private OrderStatusGQO orderItemStatus;
    private Integer orderQuantity;
    private OrderableThingGQO orderedItem;
    private Collection<ActionGQO> potentialActions;
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
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> attributes;
    @javax.validation.constraints.NotNull
    private String id;

    public OrderItemGQO() {
    }

    public OrderItemGQO(OrderGQO partOfOrder, ParcelDeliveryGQO orderDelivery, String orderItemNumber, OrderStatusGQO orderItemStatus, Integer orderQuantity, OrderableThingGQO orderedItem, Collection<ActionGQO> potentialActions, CartItemTypeGQO type, Collection<String> images, MoneyGQO unitTotal, MoneyGQO lineTotal, Integer quantity, java.util.Date createdAt, java.util.Date updatedAt, Collection<CustomAttributeGQO> attributes, String id) {
        this.partOfOrder = partOfOrder;
        this.orderDelivery = orderDelivery;
        this.orderItemNumber = orderItemNumber;
        this.orderItemStatus = orderItemStatus;
        this.orderQuantity = orderQuantity;
        this.orderedItem = orderedItem;
        this.potentialActions = potentialActions;
        this.type = type;
        this.images = images;
        this.unitTotal = unitTotal;
        this.lineTotal = lineTotal;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.attributes = attributes;
        this.id = id;
    }

    public OrderGQO getPartOfOrder() {
        return partOfOrder;
    }
    public void setPartOfOrder(OrderGQO partOfOrder) {
        this.partOfOrder = partOfOrder;
    }

    public ParcelDeliveryGQO getOrderDelivery() {
        return orderDelivery;
    }
    public void setOrderDelivery(ParcelDeliveryGQO orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public String getOrderItemNumber() {
        return orderItemNumber;
    }
    public void setOrderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }

    public OrderStatusGQO getOrderItemStatus() {
        return orderItemStatus;
    }
    public void setOrderItemStatus(OrderStatusGQO orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public OrderableThingGQO getOrderedItem() {
        return orderedItem;
    }
    public void setOrderedItem(OrderableThingGQO orderedItem) {
        this.orderedItem = orderedItem;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
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

    public Collection<CustomAttributeGQO> getAttributes() {
        return attributes;
    }
    public void setAttributes(Collection<CustomAttributeGQO> attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}