package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageVersionConnectionGQO {

    private Collection<PackageVersionEdgeGQO> edges;
    private Collection<PackageVersionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PackageVersionConnectionGQO() {
    }

    public PackageVersionConnectionGQO(Collection<PackageVersionEdgeGQO> edges, Collection<PackageVersionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PackageVersionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PackageVersionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PackageVersionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PackageVersionGQO> nodes) {
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