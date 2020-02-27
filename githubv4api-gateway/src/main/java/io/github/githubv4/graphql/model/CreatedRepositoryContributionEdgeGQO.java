package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedRepositoryContributionEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedRepositoryContributionGQO node;

    public CreatedRepositoryContributionEdgeGQO() {
    }

    public CreatedRepositoryContributionEdgeGQO(String cursor, CreatedRepositoryContributionGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedRepositoryContributionGQO getNode() {
        return node;
    }
    public void setNode(CreatedRepositoryContributionGQO node) {
        this.node = node;
    }

}