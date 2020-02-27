package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestReviewGQO node;

    public PullRequestReviewEdgeGQO() {
    }

    public PullRequestReviewEdgeGQO(String cursor, PullRequestReviewGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestReviewGQO getNode() {
        return node;
    }
    public void setNode(PullRequestReviewGQO node) {
        this.node = node;
    }

}