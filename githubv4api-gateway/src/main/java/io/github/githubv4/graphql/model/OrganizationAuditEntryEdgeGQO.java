package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationAuditEntryEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private OrganizationAuditEntryGQO node;

    public OrganizationAuditEntryEdgeGQO() {
    }

    public OrganizationAuditEntryEdgeGQO(String cursor, OrganizationAuditEntryGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public OrganizationAuditEntryGQO getNode() {
        return node;
    }
    public void setNode(OrganizationAuditEntryGQO node) {
        this.node = node;
    }

}