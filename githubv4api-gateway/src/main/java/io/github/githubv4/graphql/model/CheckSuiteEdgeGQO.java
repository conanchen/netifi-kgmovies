package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckSuiteEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CheckSuiteGQO node;

    public CheckSuiteEdgeGQO() {
    }

    public CheckSuiteEdgeGQO(String cursor, CheckSuiteGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckSuiteGQO getNode() {
        return node;
    }
    public void setNode(CheckSuiteGQO node) {
        this.node = node;
    }

}