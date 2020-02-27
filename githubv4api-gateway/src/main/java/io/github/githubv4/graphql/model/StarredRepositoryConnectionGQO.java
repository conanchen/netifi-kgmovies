package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class StarredRepositoryConnectionGQO {

    private Collection<StarredRepositoryEdgeGQO> edges;
    private Collection<RepositoryGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public StarredRepositoryConnectionGQO() {
    }

    public StarredRepositoryConnectionGQO(Collection<StarredRepositoryEdgeGQO> edges, Collection<RepositoryGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<StarredRepositoryEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<StarredRepositoryEdgeGQO> edges) {
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