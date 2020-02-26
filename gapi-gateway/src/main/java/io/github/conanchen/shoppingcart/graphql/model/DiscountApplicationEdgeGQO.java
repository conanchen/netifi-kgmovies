package io.github.conanchen.shoppingcart.graphql.model;

public class DiscountApplicationEdgeGQO {

    private DiscountApplicationGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public DiscountApplicationEdgeGQO() {
    }

    public DiscountApplicationEdgeGQO(DiscountApplicationGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public DiscountApplicationGQO getNode() {
        return node;
    }
    public void setNode(DiscountApplicationGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}