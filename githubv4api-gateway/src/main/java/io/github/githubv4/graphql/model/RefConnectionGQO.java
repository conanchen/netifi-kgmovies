package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RefConnectionGQO {

    private Collection<RefEdgeGQO> edges;
    private Collection<RefGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public RefConnectionGQO() {
    }

    public RefConnectionGQO(Collection<RefEdgeGQO> edges, Collection<RefGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RefEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RefEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RefGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RefGQO> nodes) {
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