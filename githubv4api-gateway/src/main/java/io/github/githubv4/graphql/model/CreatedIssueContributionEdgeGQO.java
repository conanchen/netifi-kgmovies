package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedIssueContributionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedIssueContributionGQO node;

    public CreatedIssueContributionEdgeGQO() {
    }

    public CreatedIssueContributionEdgeGQO(String cursor, CreatedIssueContributionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedIssueContributionGQO getNode() {
        return node;
    }
    public void setNode(CreatedIssueContributionGQO node) {
        this.node = node;
    }

}