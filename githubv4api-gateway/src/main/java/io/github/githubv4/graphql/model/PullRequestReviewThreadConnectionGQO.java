package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewThreadConnectionGQO {

    private Collection<PullRequestReviewThreadEdgeGQO> edges;
    private Collection<PullRequestReviewThreadGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PullRequestReviewThreadConnectionGQO() {
    }

    public PullRequestReviewThreadConnectionGQO(Collection<PullRequestReviewThreadEdgeGQO> edges, Collection<PullRequestReviewThreadGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestReviewThreadEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestReviewThreadEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestReviewThreadGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestReviewThreadGQO> nodes) {
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