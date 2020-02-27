package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DependencyGraphManifestConnectionGQO {

    private Collection<DependencyGraphManifestEdgeGQO> edges;
    private Collection<DependencyGraphManifestGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public DependencyGraphManifestConnectionGQO() {
    }

    public DependencyGraphManifestConnectionGQO(Collection<DependencyGraphManifestEdgeGQO> edges, Collection<DependencyGraphManifestGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DependencyGraphManifestEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DependencyGraphManifestEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<DependencyGraphManifestGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DependencyGraphManifestGQO> nodes) {
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