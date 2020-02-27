package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageTagConnectionGQO {

    private Collection<RegistryPackageTagEdgeGQO> edges;
    private Collection<RegistryPackageTagGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public RegistryPackageTagConnectionGQO() {
    }

    public RegistryPackageTagConnectionGQO(Collection<RegistryPackageTagEdgeGQO> edges, Collection<RegistryPackageTagGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageTagEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageTagEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageTagGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageTagGQO> nodes) {
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