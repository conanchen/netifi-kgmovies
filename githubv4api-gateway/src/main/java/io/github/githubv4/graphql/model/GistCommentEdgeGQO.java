package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistCommentEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private GistCommentGQO node;

    public GistCommentEdgeGQO() {
    }

    public GistCommentEdgeGQO(String cursor, GistCommentGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public GistCommentGQO getNode() {
        return node;
    }
    public void setNode(GistCommentGQO node) {
        this.node = node;
    }

}