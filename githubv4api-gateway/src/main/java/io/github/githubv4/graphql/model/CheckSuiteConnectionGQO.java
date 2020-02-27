package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckSuiteConnectionGQO {

    private Collection<CheckSuiteEdgeGQO> edges;
    private Collection<CheckSuiteGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CheckSuiteConnectionGQO() {
    }

    public CheckSuiteConnectionGQO(Collection<CheckSuiteEdgeGQO> edges, Collection<CheckSuiteGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CheckSuiteEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckSuiteEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CheckSuiteGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CheckSuiteGQO> nodes) {
        this.nodes = nodes;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}