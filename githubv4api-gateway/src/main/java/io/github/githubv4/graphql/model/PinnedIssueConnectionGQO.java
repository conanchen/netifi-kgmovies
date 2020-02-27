package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PinnedIssueConnectionGQO {

    private Collection<PinnedIssueEdgeGQO> edges;
    private Collection<PinnedIssueGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PinnedIssueConnectionGQO() {
    }

    public PinnedIssueConnectionGQO(Collection<PinnedIssueEdgeGQO> edges, Collection<PinnedIssueGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PinnedIssueEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PinnedIssueEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PinnedIssueGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PinnedIssueGQO> nodes) {
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