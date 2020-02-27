package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CommitGQO node;

    public CommitEdgeGQO() {
    }

    public CommitEdgeGQO(String cursor, CommitGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CommitGQO getNode() {
        return node;
    }
    public void setNode(CommitGQO node) {
        this.node = node;
    }

}