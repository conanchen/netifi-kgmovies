package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RegistryPackageGQO node;

    public RegistryPackageEdgeGQO() {
    }

    public RegistryPackageEdgeGQO(String cursor, RegistryPackageGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageGQO getNode() {
        return node;
    }
    public void setNode(RegistryPackageGQO node) {
        this.node = node;
    }

}