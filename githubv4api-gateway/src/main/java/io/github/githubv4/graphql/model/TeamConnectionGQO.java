package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamConnectionGQO {

    private Collection<TeamEdgeGQO> edges;
    private Collection<TeamGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public TeamConnectionGQO() {
    }

    public TeamConnectionGQO(Collection<TeamEdgeGQO> edges, Collection<TeamGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<TeamGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<TeamGQO> nodes) {
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