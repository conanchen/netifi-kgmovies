package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestTimelineItemEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestTimelineItemGQO node;

    public PullRequestTimelineItemEdgeGQO() {
    }

    public PullRequestTimelineItemEdgeGQO(String cursor, PullRequestTimelineItemGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestTimelineItemGQO getNode() {
        return node;
    }
    public void setNode(PullRequestTimelineItemGQO node) {
        this.node = node;
    }

}