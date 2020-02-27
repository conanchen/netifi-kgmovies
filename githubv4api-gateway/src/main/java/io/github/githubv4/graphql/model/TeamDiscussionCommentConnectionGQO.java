package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionCommentConnectionGQO {

    private Collection<TeamDiscussionCommentEdgeGQO> edges;
    private Collection<TeamDiscussionCommentGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public TeamDiscussionCommentConnectionGQO() {
    }

    public TeamDiscussionCommentConnectionGQO(Collection<TeamDiscussionCommentEdgeGQO> edges, Collection<TeamDiscussionCommentGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamDiscussionCommentEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamDiscussionCommentEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<TeamDiscussionCommentGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<TeamDiscussionCommentGQO> nodes) {
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