package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PackageGQO node;

    public PackageEdgeGQO() {
    }

    public PackageEdgeGQO(String cursor, PackageGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PackageGQO getNode() {
        return node;
    }
    public void setNode(PackageGQO node) {
        this.node = node;
    }

}