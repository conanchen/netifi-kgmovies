package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserStatusConnectionGQO {

    private Collection<UserStatusEdgeGQO> edges;
    private Collection<UserStatusGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public UserStatusConnectionGQO() {
    }

    public UserStatusConnectionGQO(Collection<UserStatusEdgeGQO> edges, Collection<UserStatusGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<UserStatusEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<UserStatusEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<UserStatusGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<UserStatusGQO> nodes) {
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