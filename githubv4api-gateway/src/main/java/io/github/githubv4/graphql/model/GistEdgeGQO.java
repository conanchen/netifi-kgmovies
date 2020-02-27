package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private GistGQO node;

    public GistEdgeGQO() {
    }

    public GistEdgeGQO(String cursor, GistGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public GistGQO getNode() {
        return node;
    }
    public void setNode(GistGQO node) {
        this.node = node;
    }

}