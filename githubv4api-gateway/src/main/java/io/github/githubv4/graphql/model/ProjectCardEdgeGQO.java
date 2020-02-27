package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectCardEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ProjectCardGQO node;

    public ProjectCardEdgeGQO() {
    }

    public ProjectCardEdgeGQO(String cursor, ProjectCardGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ProjectCardGQO getNode() {
        return node;
    }
    public void setNode(ProjectCardGQO node) {
        this.node = node;
    }

}