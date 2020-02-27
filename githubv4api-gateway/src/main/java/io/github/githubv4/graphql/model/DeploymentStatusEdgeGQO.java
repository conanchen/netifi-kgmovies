package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentStatusEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private DeploymentStatusGQO node;

    public DeploymentStatusEdgeGQO() {
    }

    public DeploymentStatusEdgeGQO(String cursor, DeploymentStatusGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DeploymentStatusGQO getNode() {
        return node;
    }
    public void setNode(DeploymentStatusGQO node) {
        this.node = node;
    }

}