package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ReleaseGQO node;

    public ReleaseEdgeGQO() {
    }

    public ReleaseEdgeGQO(String cursor, ReleaseGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReleaseGQO getNode() {
        return node;
    }
    public void setNode(ReleaseGQO node) {
        this.node = node;
    }

}