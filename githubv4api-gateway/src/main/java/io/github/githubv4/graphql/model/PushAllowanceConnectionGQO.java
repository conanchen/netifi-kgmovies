package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PushAllowanceConnectionGQO {

    private Collection<PushAllowanceEdgeGQO> edges;
    private Collection<PushAllowanceGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PushAllowanceConnectionGQO() {
    }

    public PushAllowanceConnectionGQO(Collection<PushAllowanceEdgeGQO> edges, Collection<PushAllowanceGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PushAllowanceEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PushAllowanceEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PushAllowanceGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PushAllowanceGQO> nodes) {
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