package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserStatusEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private UserStatusGQO node;

    public UserStatusEdgeGQO() {
    }

    public UserStatusEdgeGQO(String cursor, UserStatusGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserStatusGQO getNode() {
        return node;
    }
    public void setNode(UserStatusGQO node) {
        this.node = node;
    }

}