package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewDismissalAllowanceConnectionGQO {

    private Collection<ReviewDismissalAllowanceEdgeGQO> edges;
    private Collection<ReviewDismissalAllowanceGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ReviewDismissalAllowanceConnectionGQO() {
    }

    public ReviewDismissalAllowanceConnectionGQO(Collection<ReviewDismissalAllowanceEdgeGQO> edges, Collection<ReviewDismissalAllowanceGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReviewDismissalAllowanceEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReviewDismissalAllowanceEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ReviewDismissalAllowanceGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReviewDismissalAllowanceGQO> nodes) {
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