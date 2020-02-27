package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewCommentConnectionGQO {

    private Collection<PullRequestReviewCommentEdgeGQO> edges;
    private Collection<PullRequestReviewCommentGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PullRequestReviewCommentConnectionGQO() {
    }

    public PullRequestReviewCommentConnectionGQO(Collection<PullRequestReviewCommentEdgeGQO> edges, Collection<PullRequestReviewCommentGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestReviewCommentEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestReviewCommentEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestReviewCommentGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestReviewCommentGQO> nodes) {
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