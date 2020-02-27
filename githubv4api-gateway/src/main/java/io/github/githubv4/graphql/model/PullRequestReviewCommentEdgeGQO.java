package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewCommentEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestReviewCommentGQO node;

    public PullRequestReviewCommentEdgeGQO() {
    }

    public PullRequestReviewCommentEdgeGQO(String cursor, PullRequestReviewCommentGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestReviewCommentGQO getNode() {
        return node;
    }
    public void setNode(PullRequestReviewCommentGQO node) {
        this.node = node;
    }

}