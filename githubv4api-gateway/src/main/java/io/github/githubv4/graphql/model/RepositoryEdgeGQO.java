package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RepositoryGQO node;

    public RepositoryEdgeGQO() {
    }

    public RepositoryEdgeGQO(String cursor, RepositoryGQO node) {
        this.cursor = cursor;
        this.node = node;
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

}