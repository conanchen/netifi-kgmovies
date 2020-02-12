package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.ActionUnionGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class OrderItemGQO implements NodeGQO{

    private OrderGQO partOfOrder;
    private ParcelDeliveryGQO orderDelivery;
    private String orderItemNumber;
    private OrderStatusGQO orderItemStatus;
    private Integer orderQuantity;
    private OrderableThingGQO orderedItem;
    private Collection<ActionUnionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String id;

    public OrderItemGQO() {
    }

    public OrderItemGQO(OrderGQO partOfOrder, ParcelDeliveryGQO orderDelivery, String orderItemNumber, OrderStatusGQO orderItemStatus, Integer orderQuantity, OrderableThingGQO orderedItem, Collection<ActionUnionGQO> potentialActions, String id) {
        this.partOfOrder = partOfOrder;
        this.orderDelivery = orderDelivery;
        this.orderItemNumber = orderItemNumber;
        this.orderItemStatus = orderItemStatus;
        this.orderQuantity = orderQuantity;
        this.orderedItem = orderedItem;
        this.potentialActions = potentialActions;
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