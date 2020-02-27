package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamRepositoryEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private RepositoryGQO node;
    @javax.validation.constraints.NotNull
    private RepositoryPermissionGQO permission;

    public TeamRepositoryEdgeGQO() {
    }

    public TeamRepositoryEdgeGQO(String cursor, RepositoryGQO node, RepositoryPermissionGQO permission) {
        this.cursor = cursor;
        this.node = node;
        this.permission = permission;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RepositoryGQO getNode() {
        return node;
    }
    public void setNode(RepositoryGQO node) {
        this.node = node;
    }

    public RepositoryPermissionGQO getPermission() {
        return permission;
    }
    public void setPermission(RepositoryPermissionGQO permission) {
        this.permission = permission;
    }

}