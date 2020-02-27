package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MilestoneEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private MilestoneGQO node;

    public MilestoneEdgeGQO() {
    }

    public MilestoneEdgeGQO(String cursor, MilestoneGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public MilestoneGQO getNode() {
        return node;
    }
    public void setNode(MilestoneGQO node) {
        this.node = node;
    }

}