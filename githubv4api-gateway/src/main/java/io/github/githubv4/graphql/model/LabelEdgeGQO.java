package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LabelEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private LabelGQO node;

    public LabelEdgeGQO() {
    }

    public LabelEdgeGQO(String cursor, LabelGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public LabelGQO getNode() {
        return node;
    }
    public void setNode(LabelGQO node) {
        this.node = node;
    }

}