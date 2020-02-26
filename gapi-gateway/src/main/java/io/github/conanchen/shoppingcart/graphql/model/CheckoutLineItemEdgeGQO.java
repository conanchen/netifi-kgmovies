package io.github.conanchen.shoppingcart.graphql.model;

public class CheckoutLineItemEdgeGQO {

    private CheckoutLineItemGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public CheckoutLineItemEdgeGQO() {
    }

    public CheckoutLineItemEdgeGQO(CheckoutLineItemGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public CheckoutLineItemGQO getNode() {
        return node;
    }
    public void setNode(CheckoutLineItemGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}