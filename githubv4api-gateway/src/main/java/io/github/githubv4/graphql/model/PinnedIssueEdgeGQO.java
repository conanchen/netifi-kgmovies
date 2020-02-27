package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PinnedIssueEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PinnedIssueGQO node;

    public PinnedIssueEdgeGQO() {
    }

    public PinnedIssueEdgeGQO(String cursor, PinnedIssueGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PinnedIssueGQO getNode() {
        return node;
    }
    public void setNode(PinnedIssueGQO node) {
        this.node = node;
    }

}