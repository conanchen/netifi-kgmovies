package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckAnnotationEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CheckAnnotationGQO node;

    public CheckAnnotationEdgeGQO() {
    }

    public CheckAnnotationEdgeGQO(String cursor, CheckAnnotationGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckAnnotationGQO getNode() {
        return node;
    }
    public void setNode(CheckAnnotationGQO node) {
        this.node = node;
    }

}