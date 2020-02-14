package io.github.conanchen.intangible.graphql.model;

public class BrandsEdgeGQO {

    private BrandGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public BrandsEdgeGQO() {
    }

    public BrandsEdgeGQO(BrandGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public BrandGQO getNode() {
        return node;
    }
    public void setNode(BrandGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}