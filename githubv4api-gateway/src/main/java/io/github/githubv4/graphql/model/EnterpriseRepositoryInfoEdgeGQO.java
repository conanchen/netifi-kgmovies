package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseRepositoryInfoEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseRepositoryInfoGQO node;

    public EnterpriseRepositoryInfoEdgeGQO() {
    }

    public EnterpriseRepositoryInfoEdgeGQO(String cursor, EnterpriseRepositoryInfoGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseRepositoryInfoGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseRepositoryInfoGQO node) {
        this.node = node;
    }

}