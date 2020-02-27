package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryTopicEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RepositoryTopicGQO node;

    public RepositoryTopicEdgeGQO() {
    }

    public RepositoryTopicEdgeGQO(String cursor, RepositoryTopicGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RepositoryTopicGQO getNode() {
        return node;
    }
    public void setNode(RepositoryTopicGQO node) {
        this.node = node;
    }

}