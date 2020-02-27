package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageConnectionGQO {

    private Collection<RegistryPackageEdgeGQO> edges;
    private Collection<RegistryPackageGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public RegistryPackageConnectionGQO() {
    }

    public RegistryPackageConnectionGQO(Collection<RegistryPackageEdgeGQO> edges, Collection<RegistryPackageGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageGQO> nodes) {
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