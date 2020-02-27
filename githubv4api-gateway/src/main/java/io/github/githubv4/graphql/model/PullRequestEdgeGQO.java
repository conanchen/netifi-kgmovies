package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestGQO node;

    public PullRequestEdgeGQO() {
    }

    public PullRequestEdgeGQO(String cursor, PullRequestGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestGQO getNode() {
        return node;
    }
    public void setNode(PullRequestGQO node) {
        this.node = node;
    }

}