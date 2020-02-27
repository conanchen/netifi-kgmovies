package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewRequestEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ReviewRequestGQO node;

    public ReviewRequestEdgeGQO() {
    }

    public ReviewRequestEdgeGQO(String cursor, ReviewRequestGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReviewRequestGQO getNode() {
        return node;
    }
    public void setNode(ReviewRequestGQO node) {
        this.node = node;
    }

}