package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentConnectionGQO {

    private Collection<DeploymentEdgeGQO> edges;
    private Collection<DeploymentGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public DeploymentConnectionGQO() {
    }

    public DeploymentConnectionGQO(Collection<DeploymentEdgeGQO> edges, Collection<DeploymentGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DeploymentEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DeploymentEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<DeploymentGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DeploymentGQO> nodes) {
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