package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageVersionConnectionGQO {

    private Collection<RegistryPackageVersionEdgeGQO> edges;
    private Collection<RegistryPackageVersionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public RegistryPackageVersionConnectionGQO() {
    }

    public RegistryPackageVersionConnectionGQO(Collection<RegistryPackageVersionEdgeGQO> edges, Collection<RegistryPackageVersionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageVersionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageVersionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageVersionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageVersionGQO> nodes) {
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