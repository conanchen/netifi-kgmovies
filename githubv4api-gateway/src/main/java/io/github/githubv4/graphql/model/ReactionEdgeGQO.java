package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReactionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ReactionGQO node;

    public ReactionEdgeGQO() {
    }

    public ReactionEdgeGQO(String cursor, ReactionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReactionGQO getNode() {
        return node;
    }
    public void setNode(ReactionGQO node) {
        this.node = node;
    }

}