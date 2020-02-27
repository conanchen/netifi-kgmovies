package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueCommentEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private IssueCommentGQO node;

    public IssueCommentEdgeGQO() {
    }

    public IssueCommentEdgeGQO(String cursor, IssueCommentGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueCommentGQO getNode() {
        return node;
    }
    public void setNode(IssueCommentGQO node) {
        this.node = node;
    }

}