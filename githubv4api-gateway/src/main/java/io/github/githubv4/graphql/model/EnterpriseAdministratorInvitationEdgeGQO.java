package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseAdministratorInvitationEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseAdministratorInvitationGQO node;

    public EnterpriseAdministratorInvitationEdgeGQO() {
    }

    public EnterpriseAdministratorInvitationEdgeGQO(String cursor, EnterpriseAdministratorInvitationGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseAdministratorInvitationGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseAdministratorInvitationGQO node) {
        this.node = node;
    }

}