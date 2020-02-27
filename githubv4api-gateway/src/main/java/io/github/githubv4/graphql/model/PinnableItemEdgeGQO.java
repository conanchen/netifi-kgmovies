package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PinnableItemEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PinnableItemGQO node;

    public PinnableItemEdgeGQO() {
    }

    public PinnableItemEdgeGQO(String cursor, PinnableItemGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PinnableItemGQO getNode() {
        return node;
    }
    public void setNode(PinnableItemGQO node) {
        this.node = node;
    }

}