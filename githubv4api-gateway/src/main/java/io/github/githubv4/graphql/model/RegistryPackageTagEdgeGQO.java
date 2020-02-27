package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageTagEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RegistryPackageTagGQO node;

    public RegistryPackageTagEdgeGQO() {
    }

    public RegistryPackageTagEdgeGQO(String cursor, RegistryPackageTagGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageTagGQO getNode() {
        return node;
    }
    public void setNode(RegistryPackageTagGQO node) {
        this.node = node;
    }

}