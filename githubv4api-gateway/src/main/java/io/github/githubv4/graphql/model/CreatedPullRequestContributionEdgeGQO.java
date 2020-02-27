package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedPullRequestContributionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedPullRequestContributionGQO node;

    public CreatedPullRequestContributionEdgeGQO() {
    }

    public CreatedPullRequestContributionEdgeGQO(String cursor, CreatedPullRequestContributionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedPullRequestContributionGQO getNode() {
        return node;
    }
    public void setNode(CreatedPullRequestContributionGQO node) {
        this.node = node;
    }

}