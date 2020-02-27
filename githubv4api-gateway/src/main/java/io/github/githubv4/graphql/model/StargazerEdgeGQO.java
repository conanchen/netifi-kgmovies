package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class StargazerEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private UserGQO node;
    @javax.validation.constraints.NotNull
    private java.util.Date starredAt;

    public StargazerEdgeGQO() {
    }

    public StargazerEdgeGQO(String cursor, UserGQO node, java.util.Date starredAt) {
        this.cursor = cursor;
        this.node = node;
        this.starredAt = starredAt;
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

    public java.util.Date getStarredAt() {
        return starredAt;
    }
    public void setStarredAt(java.util.Date starredAt) {
        this.starredAt = starredAt;
    }

}