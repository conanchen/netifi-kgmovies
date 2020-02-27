package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedIssueContributionConnectionGQO {

    private Collection<CreatedIssueContributionEdgeGQO> edges;
    private Collection<CreatedIssueContributionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CreatedIssueContributionConnectionGQO() {
    }

    public CreatedIssueContributionConnectionGQO(Collection<CreatedIssueContributionEdgeGQO> edges, Collection<CreatedIssueContributionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedIssueContributionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedIssueContributionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CreatedIssueContributionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedIssueContributionGQO> nodes) {
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