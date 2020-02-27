package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueTimelineItemsConnectionGQO {

    private Collection<IssueTimelineItemsEdgeGQO> edges;
    @javax.validation.constraints.NotNull
    private Integer filteredCount;
    private Collection<IssueTimelineItemsGQO> nodes;
    @javax.validation.constraints.NotNull
    private Integer pageCount;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public IssueTimelineItemsConnectionGQO() {
    }

    public IssueTimelineItemsConnectionGQO(Collection<IssueTimelineItemsEdgeGQO> edges, Integer filteredCount, Collection<IssueTimelineItemsGQO> nodes, Integer pageCount, PageInfoGQO pageInfo, Integer totalCount, java.util.Date updatedAt) {
        this.edges = edges;
        this.filteredCount = filteredCount;
        this.nodes = nodes;
        this.pageCount = pageCount;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.updatedAt = updatedAt;
    }

    public Collection<IssueTimelineItemsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueTimelineItemsEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getFilteredCount() {
        return filteredCount;
    }
    public void setFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
    }

    public Collection<IssueTimelineItemsGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueTimelineItemsGQO> nodes) {
        this.nodes = nodes;
    }

    public Integer getPageCount() {
        return pageCount;
    }
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
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

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}