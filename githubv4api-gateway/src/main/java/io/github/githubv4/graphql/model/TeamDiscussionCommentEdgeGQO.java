package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionCommentEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private TeamDiscussionCommentGQO node;

    public TeamDiscussionCommentEdgeGQO() {
    }

    public TeamDiscussionCommentEdgeGQO(String cursor, TeamDiscussionCommentGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public TeamDiscussionCommentGQO getNode() {
        return node;
    }
    public void setNode(TeamDiscussionCommentGQO node) {
        this.node = node;
    }

}