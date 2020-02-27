package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageDependencyEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RegistryPackageDependencyGQO node;

    public RegistryPackageDependencyEdgeGQO() {
    }

    public RegistryPackageDependencyEdgeGQO(String cursor, RegistryPackageDependencyGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageDependencyGQO getNode() {
        return node;
    }
    public void setNode(RegistryPackageDependencyGQO node) {
        this.node = node;
    }

}