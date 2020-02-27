package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageFileEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PackageFileGQO node;

    public PackageFileEdgeGQO() {
    }

    public PackageFileEdgeGQO(String cursor, PackageFileGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PackageFileGQO getNode() {
        return node;
    }
    public void setNode(PackageFileGQO node) {
        this.node = node;
    }

}