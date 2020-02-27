package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PushAllowanceEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PushAllowanceGQO node;

    public PushAllowanceEdgeGQO() {
    }

    public PushAllowanceEdgeGQO(String cursor, PushAllowanceGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PushAllowanceGQO getNode() {
        return node;
    }
    public void setNode(PushAllowanceGQO node) {
        this.node = node;
    }

}