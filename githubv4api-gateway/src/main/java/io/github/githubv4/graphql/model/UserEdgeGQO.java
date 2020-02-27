package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private UserGQO node;

    public UserEdgeGQO() {
    }

    public UserEdgeGQO(String cursor, UserGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

}