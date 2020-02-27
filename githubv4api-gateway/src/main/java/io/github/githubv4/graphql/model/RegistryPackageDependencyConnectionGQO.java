package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageDependencyConnectionGQO {

    private Collection<RegistryPackageDependencyEdgeGQO> edges;
    private Collection<RegistryPackageDependencyGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public RegistryPackageDependencyConnectionGQO() {
    }

    public RegistryPackageDependencyConnectionGQO(Collection<RegistryPackageDependencyEdgeGQO> edges, Collection<RegistryPackageDependencyGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageDependencyEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageDependencyEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageDependencyGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageDependencyGQO> nodes) {
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