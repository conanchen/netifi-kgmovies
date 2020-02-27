package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DependencyGraphManifestEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private DependencyGraphManifestGQO node;

    public DependencyGraphManifestEdgeGQO() {
    }

    public DependencyGraphManifestEdgeGQO(String cursor, DependencyGraphManifestGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DependencyGraphManifestGQO getNode() {
        return node;
    }
    public void setNode(DependencyGraphManifestGQO node) {
        this.node = node;
    }

}