package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewRequestConnectionGQO {

    private Collection<ReviewRequestEdgeGQO> edges;
    private Collection<ReviewRequestGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ReviewRequestConnectionGQO() {
    }

    public ReviewRequestConnectionGQO(Collection<ReviewRequestEdgeGQO> edges, Collection<ReviewRequestGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReviewRequestEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReviewRequestEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ReviewRequestGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReviewRequestGQO> nodes) {
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