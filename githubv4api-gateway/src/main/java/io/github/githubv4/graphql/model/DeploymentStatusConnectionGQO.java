package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentStatusConnectionGQO {

    private Collection<DeploymentStatusEdgeGQO> edges;
    private Collection<DeploymentStatusGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public DeploymentStatusConnectionGQO() {
    }

    public DeploymentStatusConnectionGQO(Collection<DeploymentStatusEdgeGQO> edges, Collection<DeploymentStatusGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DeploymentStatusEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DeploymentStatusEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<DeploymentStatusGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DeploymentStatusGQO> nodes) {
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