package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private SecurityAdvisoryGQO node;

    public SecurityAdvisoryEdgeGQO() {
    }

    public SecurityAdvisoryEdgeGQO(String cursor, SecurityAdvisoryGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SecurityAdvisoryGQO getNode() {
        return node;
    }
    public void setNode(SecurityAdvisoryGQO node) {
        this.node = node;
    }

}