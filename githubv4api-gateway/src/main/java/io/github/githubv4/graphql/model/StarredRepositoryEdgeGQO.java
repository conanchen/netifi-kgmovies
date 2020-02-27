package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class StarredRepositoryEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private RepositoryGQO node;
    @javax.validation.constraints.NotNull
    private java.util.Date starredAt;

    public StarredRepositoryEdgeGQO() {
    }

    public StarredRepositoryEdgeGQO(String cursor, RepositoryGQO node, java.util.Date starredAt) {
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

    public RepositoryGQO getNode() {
        return node;
    }
    public void setNode(RepositoryGQO node) {
        this.node = node;
    }

    public java.util.Date getStarredAt() {
        return starredAt;
    }
    public void setStarredAt(java.util.Date starredAt) {
        this.starredAt = starredAt;
    }

}