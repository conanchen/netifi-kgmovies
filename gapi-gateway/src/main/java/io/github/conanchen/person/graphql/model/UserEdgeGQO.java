package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class UserEdgeGQO {

    private UserGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public UserEdgeGQO() {
    }

    public UserEdgeGQO(UserGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}