package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedPullRequestContributionConnectionGQO {

    private Collection<CreatedPullRequestContributionEdgeGQO> edges;
    private Collection<CreatedPullRequestContributionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CreatedPullRequestContributionConnectionGQO() {
    }

    public CreatedPullRequestContributionConnectionGQO(Collection<CreatedPullRequestContributionEdgeGQO> edges, Collection<CreatedPullRequestContributionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedPullRequestContributionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedPullRequestContributionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CreatedPullRequestContributionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedPullRequestContributionGQO> nodes) {
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