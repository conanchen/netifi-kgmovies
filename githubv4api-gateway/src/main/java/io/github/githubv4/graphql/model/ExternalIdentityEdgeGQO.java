package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ExternalIdentityEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ExternalIdentityGQO node;

    public ExternalIdentityEdgeGQO() {
    }

    public ExternalIdentityEdgeGQO(String cursor, ExternalIdentityGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ExternalIdentityGQO getNode() {
        return node;
    }
    public void setNode(ExternalIdentityGQO node) {
        this.node = node;
    }

}