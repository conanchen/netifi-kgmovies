package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DependencyGraphDependencyEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private DependencyGraphDependencyGQO node;

    public DependencyGraphDependencyEdgeGQO() {
    }

    public DependencyGraphDependencyEdgeGQO(String cursor, DependencyGraphDependencyGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DependencyGraphDependencyGQO getNode() {
        return node;
    }
    public void setNode(DependencyGraphDependencyGQO node) {
        this.node = node;
    }

}