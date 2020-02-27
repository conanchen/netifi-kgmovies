package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistCommentConnectionGQO {

    private Collection<GistCommentEdgeGQO> edges;
    private Collection<GistCommentGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public GistCommentConnectionGQO() {
    }

    public GistCommentConnectionGQO(Collection<GistCommentEdgeGQO> edges, Collection<GistCommentGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<GistCommentEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<GistCommentEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<GistCommentGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<GistCommentGQO> nodes) {
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