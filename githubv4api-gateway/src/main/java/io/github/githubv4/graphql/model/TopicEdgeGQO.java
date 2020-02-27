package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TopicEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private TopicGQO node;

    public TopicEdgeGQO() {
    }

    public TopicEdgeGQO(String cursor, TopicGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public TopicGQO getNode() {
        return node;
    }
    public void setNode(TopicGQO node) {
        this.node = node;
    }

}