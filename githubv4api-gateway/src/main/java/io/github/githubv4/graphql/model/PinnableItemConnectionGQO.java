package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PinnableItemConnectionGQO {

    private Collection<PinnableItemEdgeGQO> edges;
    private Collection<PinnableItemGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PinnableItemConnectionGQO() {
    }

    public PinnableItemConnectionGQO(Collection<PinnableItemEdgeGQO> edges, Collection<PinnableItemGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PinnableItemEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PinnableItemEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PinnableItemGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PinnableItemGQO> nodes) {
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