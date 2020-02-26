package io.github.conanchen.place.graphql.model;

public class LocalBusinessEdgeGQO {

    private LocalBusinessGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public LocalBusinessEdgeGQO() {
    }

    public LocalBusinessEdgeGQO(LocalBusinessGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public LocalBusinessGQO getNode() {
        return node;
    }
    public void setNode(LocalBusinessGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}