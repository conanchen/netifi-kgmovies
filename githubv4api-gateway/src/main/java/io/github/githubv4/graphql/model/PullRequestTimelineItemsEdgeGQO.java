package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestTimelineItemsEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestTimelineItemsGQO node;

    public PullRequestTimelineItemsEdgeGQO() {
    }

    public PullRequestTimelineItemsEdgeGQO(String cursor, PullRequestTimelineItemsGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestTimelineItemsGQO getNode() {
        return node;
    }
    public void setNode(PullRequestTimelineItemsGQO node) {
        this.node = node;
    }

}