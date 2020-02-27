package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewDismissalAllowanceEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ReviewDismissalAllowanceGQO node;

    public ReviewDismissalAllowanceEdgeGQO() {
    }

    public ReviewDismissalAllowanceEdgeGQO(String cursor, ReviewDismissalAllowanceGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReviewDismissalAllowanceGQO getNode() {
        return node;
    }
    public void setNode(ReviewDismissalAllowanceGQO node) {
        this.node = node;
    }

}