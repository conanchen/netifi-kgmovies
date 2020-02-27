package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ProjectGQO node;

    public ProjectEdgeGQO() {
    }

    public ProjectEdgeGQO(String cursor, ProjectGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ProjectGQO getNode() {
        return node;
    }
    public void setNode(ProjectGQO node) {
        this.node = node;
    }

}