package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedRepositoryContributionConnectionGQO {

    private Collection<CreatedRepositoryContributionEdgeGQO> edges;
    private Collection<CreatedRepositoryContributionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CreatedRepositoryContributionConnectionGQO() {
    }

    public CreatedRepositoryContributionConnectionGQO(Collection<CreatedRepositoryContributionEdgeGQO> edges, Collection<CreatedRepositoryContributionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedRepositoryContributionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedRepositoryContributionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CreatedRepositoryContributionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedRepositoryContributionGQO> nodes) {
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