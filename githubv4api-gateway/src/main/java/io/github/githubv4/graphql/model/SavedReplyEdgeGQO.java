package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SavedReplyEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private SavedReplyGQO node;

    public SavedReplyEdgeGQO() {
    }

    public SavedReplyEdgeGQO(String cursor, SavedReplyGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SavedReplyGQO getNode() {
        return node;
    }
    public void setNode(SavedReplyGQO node) {
        this.node = node;
    }

}