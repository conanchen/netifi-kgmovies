package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReactingUserEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private UserGQO node;
    @javax.validation.constraints.NotNull
    private java.util.Date reactedAt;

    public ReactingUserEdgeGQO() {
    }

    public ReactingUserEdgeGQO(String cursor, UserGQO node, java.util.Date reactedAt) {
        this.cursor = cursor;
        this.node = node;
        this.reactedAt = reactedAt;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public java.util.Date getReactedAt() {
        return reactedAt;
    }
    public void setReactedAt(java.util.Date reactedAt) {
        this.reactedAt = reactedAt;
    }

}