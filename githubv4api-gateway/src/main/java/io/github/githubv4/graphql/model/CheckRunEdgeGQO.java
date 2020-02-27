package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CheckRunGQO node;

    public CheckRunEdgeGQO() {
    }

    public CheckRunEdgeGQO(String cursor, CheckRunGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckRunGQO getNode() {
        return node;
    }
    public void setNode(CheckRunGQO node) {
        this.node = node;
    }

}