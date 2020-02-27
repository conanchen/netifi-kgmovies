package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterprisePendingMemberInvitationEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private Boolean isUnlicensed;
    private OrganizationInvitationGQO node;

    public EnterprisePendingMemberInvitationEdgeGQO() {
    }

    public EnterprisePendingMemberInvitationEdgeGQO(String cursor, Boolean isUnlicensed, OrganizationInvitationGQO node) {
        this.cursor = cursor;
        this.isUnlicensed = isUnlicensed;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getIsUnlicensed() {
        return isUnlicensed;
    }
    public void setIsUnlicensed(Boolean isUnlicensed) {
        this.isUnlicensed = isUnlicensed;
    }

    public OrganizationInvitationGQO getNode() {
        return node;
    }
    public void setNode(OrganizationInvitationGQO node) {
        this.node = node;
    }

}