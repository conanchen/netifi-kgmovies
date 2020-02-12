package io.github.conanchen.shopping.graphql.model;

import java.util.*;
import io.github.conanchen.shopping.graphql.api.*;

public class ProductsEdgeGQO {

    private ProductGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public ProductsEdgeGQO() {
    }

    public ProductsEdgeGQO(ProductGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ProductGQO getNode() {
        return node;
    }
    public void setNode(ProductGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}