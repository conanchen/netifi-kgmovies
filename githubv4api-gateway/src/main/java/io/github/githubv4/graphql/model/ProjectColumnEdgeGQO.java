package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectColumnEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ProjectColumnGQO node;

    public ProjectColumnEdgeGQO() {
    }

    public ProjectColumnEdgeGQO(String cursor, ProjectColumnGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ProjectColumnGQO getNode() {
        return node;
    }
    public void setNode(ProjectColumnGQO node) {
        this.node = node;
    }

}