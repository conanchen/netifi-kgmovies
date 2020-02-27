package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserContentEditConnectionGQO {

    private Collection<UserContentEditEdgeGQO> edges;
    private Collection<UserContentEditGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public UserContentEditConnectionGQO() {
    }

    public UserContentEditConnectionGQO(Collection<UserContentEditEdgeGQO> edges, Collection<UserContentEditGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<UserContentEditEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<UserContentEditEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<UserContentEditGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<UserContentEditGQO> nodes) {
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