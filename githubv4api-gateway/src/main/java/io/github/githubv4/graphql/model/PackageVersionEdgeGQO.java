package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageVersionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PackageVersionGQO node;

    public PackageVersionEdgeGQO() {
    }

    public PackageVersionEdgeGQO(String cursor, PackageVersionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PackageVersionGQO getNode() {
        return node;
    }
    public void setNode(PackageVersionGQO node) {
        this.node = node;
    }

}