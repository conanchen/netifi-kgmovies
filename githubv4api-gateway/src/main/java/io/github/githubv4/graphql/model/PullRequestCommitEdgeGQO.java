package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestCommitEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestCommitGQO node;

    public PullRequestCommitEdgeGQO() {
    }

    public PullRequestCommitEdgeGQO(String cursor, PullRequestCommitGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestCommitGQO getNode() {
        return node;
    }
    public void setNode(PullRequestCommitGQO node) {
        this.node = node;
    }

}