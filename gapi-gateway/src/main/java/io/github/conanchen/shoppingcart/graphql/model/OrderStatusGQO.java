package io.github.conanchen.shoppingcart.graphql.model;

public enum OrderStatusGQO {

    OrderCancelled, 
    OrderDelivered, 
    OrderInTransit, 
    OrderPaymentDue, 
    OrderUNPAID, 
    OrderPAID, 
    OrderPickupAvailable, 
    OrderProblem, 
    OrderProcessing, 
    OrderReturned

}