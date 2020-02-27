package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RefEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RefGQO node;

    public RefEdgeGQO() {
    }

    public RefEdgeGQO(String cursor, RefGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RefGQO getNode() {
        return node;
    }
    public void setNode(RefGQO node) {
        this.node = node;
    }

}