package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private TeamDiscussionGQO node;

    public TeamDiscussionEdgeGQO() {
    }

    public TeamDiscussionEdgeGQO(String cursor, TeamDiscussionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public TeamDiscussionGQO getNode() {
        return node;
    }
    public void setNode(TeamDiscussionGQO node) {
        this.node = node;
    }

}