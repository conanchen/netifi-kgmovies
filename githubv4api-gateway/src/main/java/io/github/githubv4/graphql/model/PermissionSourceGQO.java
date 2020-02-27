package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PermissionSourceGQO {

    @javax.validation.constraints.NotNull
    private OrganizationGQO organization;
    @javax.validation.constraints.NotNull
    private DefaultRepositoryPermissionFieldGQO permission;
    @javax.validation.constraints.NotNull
    private PermissionGranterGQO source;

    public PermissionSourceGQO() {
    }

    public PermissionSourceGQO(OrganizationGQO organization, DefaultRepositoryPermissionFieldGQO permission, PermissionGranterGQO source) {
        this.organization = organization;
        this.permission = permission;
        this.source = source;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public DefaultRepositoryPermissionFieldGQO getPermission() {
        return permission;
    }
    public void setPermission(DefaultRepositoryPermissionFieldGQO permission) {
        this.permission = permission;
    }

    public PermissionGranterGQO getSource() {
        return source;
    }
    public void setSource(PermissionGranterGQO source) {
        this.source = source;
    }

}