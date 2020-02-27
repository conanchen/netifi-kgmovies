package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseAdministratorEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private UserGQO node;
    @javax.validation.constraints.NotNull
    private EnterpriseAdministratorRoleGQO role;

    public EnterpriseAdministratorEdgeGQO() {
    }

    public EnterpriseAdministratorEdgeGQO(String cursor, UserGQO node, EnterpriseAdministratorRoleGQO role) {
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

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public EnterpriseAdministratorRoleGQO getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRoleGQO role) {
        this.role = role;
    }

}