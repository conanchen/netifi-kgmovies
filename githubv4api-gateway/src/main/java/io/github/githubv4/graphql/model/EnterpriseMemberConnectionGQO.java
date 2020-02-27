package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseMemberConnectionGQO {

    private Collection<EnterpriseMemberEdgeGQO> edges;
    private Collection<EnterpriseMemberGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseMemberConnectionGQO() {
    }

    public EnterpriseMemberConnectionGQO(Collection<EnterpriseMemberEdgeGQO> edges, Collection<EnterpriseMemberGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseMemberEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseMemberEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseMemberGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseMemberGQO> nodes) {
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