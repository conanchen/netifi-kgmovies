package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationInvitationEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private OrganizationInvitationGQO node;

    public OrganizationInvitationEdgeGQO() {
    }

    public OrganizationInvitationEdgeGQO(String cursor, OrganizationInvitationGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public OrganizationInvitationGQO getNode() {
        return node;
    }
    public void setNode(OrganizationInvitationGQO node) {
        this.node = node;
    }

}