package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectConnectionGQO {

    private Collection<ProjectEdgeGQO> edges;
    private Collection<ProjectGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ProjectConnectionGQO() {
    }

    public ProjectConnectionGQO(Collection<ProjectEdgeGQO> edges, Collection<ProjectGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ProjectEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProjectEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ProjectGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ProjectGQO> nodes) {
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