package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseOrganizationMembershipEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private OrganizationGQO node;
    @javax.validation.constraints.NotNull
    private EnterpriseUserAccountMembershipRoleGQO role;

    public EnterpriseOrganizationMembershipEdgeGQO() {
    }

    public EnterpriseOrganizationMembershipEdgeGQO(String cursor, OrganizationGQO node, EnterpriseUserAccountMembershipRoleGQO role) {
        this.cursor = cursor;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public OrganizationGQO getNode() {
        return node;
    }
    public void setNode(OrganizationGQO node) {
        this.node = node;
    }

    public EnterpriseUserAccountMembershipRoleGQO getRole() {
        return role;
    }
    public void setRole(EnterpriseUserAccountMembershipRoleGQO role) {
        this.role = role;
    }

}