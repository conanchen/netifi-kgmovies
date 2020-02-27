package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamRepositoryConnectionGQO {

    private Collection<TeamRepositoryEdgeGQO> edges;
    private Collection<RepositoryGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public TeamRepositoryConnectionGQO() {
    }

    public TeamRepositoryConnectionGQO(Collection<TeamRepositoryEdgeGQO> edges, Collection<RepositoryGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamRepositoryEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamRepositoryEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RepositoryGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RepositoryGQO> nodes) {
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