package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestChangedFileEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestChangedFileGQO node;

    public PullRequestChangedFileEdgeGQO() {
    }

    public PullRequestChangedFileEdgeGQO(String cursor, PullRequestChangedFileGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestChangedFileGQO getNode() {
        return node;
    }
    public void setNode(PullRequestChangedFileGQO node) {
        this.node = node;
    }

}