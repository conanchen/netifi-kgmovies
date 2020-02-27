package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectCardConnectionGQO {

    private Collection<ProjectCardEdgeGQO> edges;
    private Collection<ProjectCardGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ProjectCardConnectionGQO() {
    }

    public ProjectCardConnectionGQO(Collection<ProjectCardEdgeGQO> edges, Collection<ProjectCardGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ProjectCardEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProjectCardEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ProjectCardGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ProjectCardGQO> nodes) {
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