package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageVersionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RegistryPackageVersionGQO node;

    public RegistryPackageVersionEdgeGQO() {
    }

    public RegistryPackageVersionEdgeGQO(String cursor, RegistryPackageVersionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageVersionGQO getNode() {
        return node;
    }
    public void setNode(RegistryPackageVersionGQO node) {
        this.node = node;
    }

}