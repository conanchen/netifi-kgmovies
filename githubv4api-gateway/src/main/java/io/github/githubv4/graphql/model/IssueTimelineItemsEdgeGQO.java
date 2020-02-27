package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueTimelineItemsEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private IssueTimelineItemsGQO node;

    public IssueTimelineItemsEdgeGQO() {
    }

    public IssueTimelineItemsEdgeGQO(String cursor, IssueTimelineItemsGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueTimelineItemsGQO getNode() {
        return node;
    }
    public void setNode(IssueTimelineItemsGQO node) {
        this.node = node;
    }

}