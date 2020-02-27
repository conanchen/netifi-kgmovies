package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseConnectionGQO {

    private Collection<ReleaseEdgeGQO> edges;
    private Collection<ReleaseGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ReleaseConnectionGQO() {
    }

    public ReleaseConnectionGQO(Collection<ReleaseEdgeGQO> edges, Collection<ReleaseGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReleaseEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReleaseEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ReleaseGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReleaseGQO> nodes) {
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