package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private DeploymentGQO node;

    public DeploymentEdgeGQO() {
    }

    public DeploymentEdgeGQO(String cursor, DeploymentGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DeploymentGQO getNode() {
        return node;
    }
    public void setNode(DeploymentGQO node) {
        this.node = node;
    }

}