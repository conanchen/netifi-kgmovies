package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectColumnConnectionGQO {

    private Collection<ProjectColumnEdgeGQO> edges;
    private Collection<ProjectColumnGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ProjectColumnConnectionGQO() {
    }

    public ProjectColumnConnectionGQO(Collection<ProjectColumnEdgeGQO> edges, Collection<ProjectColumnGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ProjectColumnEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProjectColumnEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ProjectColumnGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ProjectColumnGQO> nodes) {
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