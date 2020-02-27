package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageConnectionGQO {

    private Collection<PackageEdgeGQO> edges;
    private Collection<PackageGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PackageConnectionGQO() {
    }

    public PackageConnectionGQO(Collection<PackageEdgeGQO> edges, Collection<PackageGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PackageEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PackageEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PackageGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PackageGQO> nodes) {
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