package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageFileConnectionGQO {

    private Collection<PackageFileEdgeGQO> edges;
    private Collection<PackageFileGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PackageFileConnectionGQO() {
    }

    public PackageFileConnectionGQO(Collection<PackageFileEdgeGQO> edges, Collection<PackageFileGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PackageFileEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PackageFileEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PackageFileGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PackageFileGQO> nodes) {
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