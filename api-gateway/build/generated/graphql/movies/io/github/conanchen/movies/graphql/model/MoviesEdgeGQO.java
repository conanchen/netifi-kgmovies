package io.github.conanchen.movies.graphql.model;

import java.util.*;
import io.github.conanchen.movies.graphql.api.*;

public class MoviesEdgeGQO {

    private MovieGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public MoviesEdgeGQO() {
    }

    public MoviesEdgeGQO(MovieGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public MovieGQO getNode() {
        return node;
    }
    public void setNode(MovieGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}