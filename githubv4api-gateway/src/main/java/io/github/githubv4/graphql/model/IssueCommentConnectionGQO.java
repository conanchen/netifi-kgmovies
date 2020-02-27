package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueCommentConnectionGQO {

    private Collection<IssueCommentEdgeGQO> edges;
    private Collection<IssueCommentGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public IssueCommentConnectionGQO() {
    }

    public IssueCommentConnectionGQO(Collection<IssueCommentEdgeGQO> edges, Collection<IssueCommentGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<IssueCommentEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueCommentEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<IssueCommentGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueCommentGQO> nodes) {
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