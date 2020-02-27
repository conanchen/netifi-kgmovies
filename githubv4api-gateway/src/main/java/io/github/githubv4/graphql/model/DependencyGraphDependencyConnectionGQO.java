package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DependencyGraphDependencyConnectionGQO {

    private Collection<DependencyGraphDependencyEdgeGQO> edges;
    private Collection<DependencyGraphDependencyGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public DependencyGraphDependencyConnectionGQO() {
    }

    public DependencyGraphDependencyConnectionGQO(Collection<DependencyGraphDependencyEdgeGQO> edges, Collection<DependencyGraphDependencyGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DependencyGraphDependencyEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DependencyGraphDependencyEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<DependencyGraphDependencyGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DependencyGraphDependencyGQO> nodes) {
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