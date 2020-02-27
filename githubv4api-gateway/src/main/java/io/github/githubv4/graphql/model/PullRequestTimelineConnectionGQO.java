package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestTimelineConnectionGQO {

    private Collection<PullRequestTimelineItemEdgeGQO> edges;
    private Collection<PullRequestTimelineItemGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PullRequestTimelineConnectionGQO() {
    }

    public PullRequestTimelineConnectionGQO(Collection<PullRequestTimelineItemEdgeGQO> edges, Collection<PullRequestTimelineItemGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestTimelineItemEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestTimelineItemEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestTimelineItemGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestTimelineItemGQO> nodes) {
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