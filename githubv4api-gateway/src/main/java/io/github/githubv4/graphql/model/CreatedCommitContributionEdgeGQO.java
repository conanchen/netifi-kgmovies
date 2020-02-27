package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedCommitContributionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedCommitContributionGQO node;

    public CreatedCommitContributionEdgeGQO() {
    }

    public CreatedCommitContributionEdgeGQO(String cursor, CreatedCommitContributionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedCommitContributionGQO getNode() {
        return node;
    }
    public void setNode(CreatedCommitContributionGQO node) {
        this.node = node;
    }

}