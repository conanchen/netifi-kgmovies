package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserContentEditEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private UserContentEditGQO node;

    public UserContentEditEdgeGQO() {
    }

    public UserContentEditEdgeGQO(String cursor, UserContentEditGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserContentEditGQO getNode() {
        return node;
    }
    public void setNode(UserContentEditGQO node) {
        this.node = node;
    }

}