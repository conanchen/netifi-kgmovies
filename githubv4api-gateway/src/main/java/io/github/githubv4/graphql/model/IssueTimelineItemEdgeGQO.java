package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueTimelineItemEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private IssueTimelineItemGQO node;

    public IssueTimelineItemEdgeGQO() {
    }

    public IssueTimelineItemEdgeGQO(String cursor, IssueTimelineItemGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueTimelineItemGQO getNode() {
        return node;
    }
    public void setNode(IssueTimelineItemGQO node) {
        this.node = node;
    }

}