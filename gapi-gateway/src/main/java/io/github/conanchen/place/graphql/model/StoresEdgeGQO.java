package io.github.conanchen.place.graphql.model;

public class StoresEdgeGQO {

    private StoreGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public StoresEdgeGQO() {
    }

    public StoresEdgeGQO(StoreGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public StoreGQO getNode() {
        return node;
    }
    public void setNode(StoreGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}