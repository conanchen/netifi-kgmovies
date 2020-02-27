package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueOrPullRequestEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private IssueOrPullRequestGQO node;

    public IssueOrPullRequestEdgeGQO() {
    }

    public IssueOrPullRequestEdgeGQO(String cursor, IssueOrPullRequestGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueOrPullRequestGQO getNode() {
        return node;
    }
    public void setNode(IssueOrPullRequestGQO node) {
        this.node = node;
    }

}