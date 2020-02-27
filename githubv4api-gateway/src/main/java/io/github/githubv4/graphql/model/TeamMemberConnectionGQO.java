package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamMemberConnectionGQO {

    private Collection<TeamMemberEdgeGQO> edges;
    private Collection<UserGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public TeamMemberConnectionGQO() {
    }

    public TeamMemberConnectionGQO(Collection<TeamMemberEdgeGQO> edges, Collection<UserGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamMemberEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamMemberEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<UserGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<UserGQO> nodes) {
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