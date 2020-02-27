package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReactionConnectionGQO {

    private Collection<ReactionEdgeGQO> edges;
    private Collection<ReactionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;
    @javax.validation.constraints.NotNull
    private Boolean viewerHasReacted;

    public ReactionConnectionGQO() {
    }

    public ReactionConnectionGQO(Collection<ReactionEdgeGQO> edges, Collection<ReactionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount, Boolean viewerHasReacted) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.viewerHasReacted = viewerHasReacted;
    }

    public Collection<ReactionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReactionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ReactionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReactionGQO> nodes) {
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

    public Boolean getViewerHasReacted() {
        return viewerHasReacted;
    }
    public void setViewerHasReacted(Boolean viewerHasReacted) {
        this.viewerHasReacted = viewerHasReacted;
    }

}