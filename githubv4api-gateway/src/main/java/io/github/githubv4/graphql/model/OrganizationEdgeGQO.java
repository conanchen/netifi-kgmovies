package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private OrganizationGQO node;

    public OrganizationEdgeGQO() {
    }

    public OrganizationEdgeGQO(String cursor, OrganizationGQO node) {
        this.cursor = cursor;
        this.node = node;
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

}