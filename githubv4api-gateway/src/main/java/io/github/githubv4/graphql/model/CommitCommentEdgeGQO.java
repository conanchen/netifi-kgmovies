package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitCommentEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CommitCommentGQO node;

    public CommitCommentEdgeGQO() {
    }

    public CommitCommentEdgeGQO(String cursor, CommitCommentGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CommitCommentGQO getNode() {
        return node;
    }
    public void setNode(CommitCommentGQO node) {
        this.node = node;
    }

}