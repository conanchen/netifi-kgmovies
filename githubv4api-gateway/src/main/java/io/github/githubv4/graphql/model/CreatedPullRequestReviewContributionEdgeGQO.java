package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedPullRequestReviewContributionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedPullRequestReviewContributionGQO node;

    public CreatedPullRequestReviewContributionEdgeGQO() {
    }

    public CreatedPullRequestReviewContributionEdgeGQO(String cursor, CreatedPullRequestReviewContributionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedPullRequestReviewContributionGQO getNode() {
        return node;
    }
    public void setNode(CreatedPullRequestReviewContributionGQO node) {
        this.node = node;
    }

}