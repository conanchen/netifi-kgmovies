package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationMemberEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private Boolean hasTwoFactorEnabled;
    private UserGQO node;
    private OrganizationMemberRoleGQO role;

    public OrganizationMemberEdgeGQO() {
    }

    public OrganizationMemberEdgeGQO(String cursor, Boolean hasTwoFactorEnabled, UserGQO node, OrganizationMemberRoleGQO role) {
        this.cursor = cursor;
        this.hasTwoFactorEnabled = hasTwoFactorEnabled;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getHasTwoFactorEnabled() {
        return hasTwoFactorEnabled;
    }
    public void setHasTwoFactorEnabled(Boolean hasTwoFactorEnabled) {
        this.hasTwoFactorEnabled = hasTwoFactorEnabled;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public OrganizationMemberRoleGQO getRole() {
        return role;
    }
    public void setRole(OrganizationMemberRoleGQO role) {
        this.role = role;
    }

}