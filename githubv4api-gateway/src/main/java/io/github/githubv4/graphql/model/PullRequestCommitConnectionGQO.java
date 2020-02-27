package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestCommitConnectionGQO {

    private Collection<PullRequestCommitEdgeGQO> edges;
    private Collection<PullRequestCommitGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PullRequestCommitConnectionGQO() {
    }

    public PullRequestCommitConnectionGQO(Collection<PullRequestCommitEdgeGQO> edges, Collection<PullRequestCommitGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestCommitEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestCommitEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestCommitGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestCommitGQO> nodes) {
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