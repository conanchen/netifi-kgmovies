package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedPullRequestReviewContributionConnectionGQO {

    private Collection<CreatedPullRequestReviewContributionEdgeGQO> edges;
    private Collection<CreatedPullRequestReviewContributionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CreatedPullRequestReviewContributionConnectionGQO() {
    }

    public CreatedPullRequestReviewContributionConnectionGQO(Collection<CreatedPullRequestReviewContributionEdgeGQO> edges, Collection<CreatedPullRequestReviewContributionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedPullRequestReviewContributionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedPullRequestReviewContributionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CreatedPullRequestReviewContributionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedPullRequestReviewContributionGQO> nodes) {
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