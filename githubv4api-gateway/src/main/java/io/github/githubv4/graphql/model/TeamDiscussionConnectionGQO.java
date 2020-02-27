package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionConnectionGQO {

    private Collection<TeamDiscussionEdgeGQO> edges;
    private Collection<TeamDiscussionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public TeamDiscussionConnectionGQO() {
    }

    public TeamDiscussionConnectionGQO(Collection<TeamDiscussionEdgeGQO> edges, Collection<TeamDiscussionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamDiscussionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamDiscussionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<TeamDiscussionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<TeamDiscussionGQO> nodes) {
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