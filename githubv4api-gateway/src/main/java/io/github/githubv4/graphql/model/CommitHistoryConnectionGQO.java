package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitHistoryConnectionGQO {

    private Collection<CommitEdgeGQO> edges;
    private Collection<CommitGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CommitHistoryConnectionGQO() {
    }

    public CommitHistoryConnectionGQO(Collection<CommitEdgeGQO> edges, Collection<CommitGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CommitEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CommitEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CommitGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CommitGQO> nodes) {
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