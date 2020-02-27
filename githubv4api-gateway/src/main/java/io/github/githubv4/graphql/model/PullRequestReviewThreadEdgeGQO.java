package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewThreadEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestReviewThreadGQO node;

    public PullRequestReviewThreadEdgeGQO() {
    }

    public PullRequestReviewThreadEdgeGQO(String cursor, PullRequestReviewThreadGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestReviewThreadGQO getNode() {
        return node;
    }
    public void setNode(PullRequestReviewThreadGQO node) {
        this.node = node;
    }

}