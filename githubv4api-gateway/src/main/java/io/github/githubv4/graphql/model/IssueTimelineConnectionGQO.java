package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueTimelineConnectionGQO {

    private Collection<IssueTimelineItemEdgeGQO> edges;
    private Collection<IssueTimelineItemGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public IssueTimelineConnectionGQO() {
    }

    public IssueTimelineConnectionGQO(Collection<IssueTimelineItemEdgeGQO> edges, Collection<IssueTimelineItemGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<IssueTimelineItemEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueTimelineItemEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<IssueTimelineItemGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueTimelineItemGQO> nodes) {
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