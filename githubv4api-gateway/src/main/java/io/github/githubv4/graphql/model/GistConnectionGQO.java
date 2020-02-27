package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistConnectionGQO {

    private Collection<GistEdgeGQO> edges;
    private Collection<GistGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public GistConnectionGQO() {
    }

    public GistConnectionGQO(Collection<GistEdgeGQO> edges, Collection<GistGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<GistEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<GistEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<GistGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<GistGQO> nodes) {
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