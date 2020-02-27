package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestConnectionGQO {

    private Collection<PullRequestEdgeGQO> edges;
    private Collection<PullRequestGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PullRequestConnectionGQO() {
    }

    public PullRequestConnectionGQO(Collection<PullRequestEdgeGQO> edges, Collection<PullRequestGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestGQO> nodes) {
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