package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeployKeyConnectionGQO {

    private Collection<DeployKeyEdgeGQO> edges;
    private Collection<DeployKeyGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public DeployKeyConnectionGQO() {
    }

    public DeployKeyConnectionGQO(Collection<DeployKeyEdgeGQO> edges, Collection<DeployKeyGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DeployKeyEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DeployKeyEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<DeployKeyGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DeployKeyGQO> nodes) {
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