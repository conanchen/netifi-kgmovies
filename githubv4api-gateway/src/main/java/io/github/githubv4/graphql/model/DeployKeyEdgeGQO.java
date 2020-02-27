package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeployKeyEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private DeployKeyGQO node;

    public DeployKeyEdgeGQO() {
    }

    public DeployKeyEdgeGQO(String cursor, DeployKeyGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DeployKeyGQO getNode() {
        return node;
    }
    public void setNode(DeployKeyGQO node) {
        this.node = node;
    }

}