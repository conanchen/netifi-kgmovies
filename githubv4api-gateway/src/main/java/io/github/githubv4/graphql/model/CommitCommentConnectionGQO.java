package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitCommentConnectionGQO {

    private Collection<CommitCommentEdgeGQO> edges;
    private Collection<CommitCommentGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CommitCommentConnectionGQO() {
    }

    public CommitCommentConnectionGQO(Collection<CommitCommentEdgeGQO> edges, Collection<CommitCommentGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CommitCommentEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CommitCommentEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CommitCommentGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CommitCommentGQO> nodes) {
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