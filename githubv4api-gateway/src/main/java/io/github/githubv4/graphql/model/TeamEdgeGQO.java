package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private TeamGQO node;

    public TeamEdgeGQO() {
    }

    public TeamEdgeGQO(String cursor, TeamGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public TeamGQO getNode() {
        return node;
    }
    public void setNode(TeamGQO node) {
        this.node = node;
    }

}