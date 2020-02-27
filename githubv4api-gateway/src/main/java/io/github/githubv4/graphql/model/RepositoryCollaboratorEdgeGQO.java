package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryCollaboratorEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private UserGQO node;
    @javax.validation.constraints.NotNull
    private RepositoryPermissionGQO permission;
    @javax.validation.constraints.NotNull
    private Collection<PermissionSourceGQO> permissionSources;

    public RepositoryCollaboratorEdgeGQO() {
    }

    public RepositoryCollaboratorEdgeGQO(String cursor, UserGQO node, RepositoryPermissionGQO permission, Collection<PermissionSourceGQO> permissionSources) {
        this.cursor = cursor;
        this.node = node;
        this.permission = permission;
        this.permissionSources = permissionSources;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public RepositoryPermissionGQO getPermission() {
        return permission;
    }
    public void setPermission(RepositoryPermissionGQO permission) {
        this.permission = permission;
    }

    public Collection<PermissionSourceGQO> getPermissionSources() {
        return permissionSources;
    }
    public void setPermissionSources(Collection<PermissionSourceGQO> permissionSources) {
        this.permissionSources = permissionSources;
    }

}