package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;

public class StoreEdgeGQO {

    private StoreGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public StoreEdgeGQO() {
    }

    public StoreEdgeGQO(StoreGQO node, String cursor) {
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