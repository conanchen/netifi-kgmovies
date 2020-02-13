package io.github.conanchen.shopping.graphql.model;

import java.util.*;
import io.github.conanchen.shopping.graphql.api.*;

public class ServicesEdgeGQO {

    private ServiceGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public ServicesEdgeGQO() {
    }

    public ServicesEdgeGQO(ServiceGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ServiceGQO getNode() {
        return node;
    }
    public void setNode(ServiceGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}