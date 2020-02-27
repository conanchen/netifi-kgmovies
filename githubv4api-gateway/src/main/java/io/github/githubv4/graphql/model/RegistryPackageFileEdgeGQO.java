package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageFileEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RegistryPackageFileGQO node;

    public RegistryPackageFileEdgeGQO() {
    }

    public RegistryPackageFileEdgeGQO(String cursor, RegistryPackageFileGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageFileGQO getNode() {
        return node;
    }
    public void setNode(RegistryPackageFileGQO node) {
        this.node = node;
    }

}