package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueConnectionGQO {

    private Collection<IssueEdgeGQO> edges;
    private Collection<IssueGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public IssueConnectionGQO() {
    }

    public IssueConnectionGQO(Collection<IssueEdgeGQO> edges, Collection<IssueGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<IssueEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<IssueGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueGQO> nodes) {
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