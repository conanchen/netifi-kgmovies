package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedCommitContributionConnectionGQO {

    private Collection<CreatedCommitContributionEdgeGQO> edges;
    private Collection<CreatedCommitContributionGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CreatedCommitContributionConnectionGQO() {
    }

    public CreatedCommitContributionConnectionGQO(Collection<CreatedCommitContributionEdgeGQO> edges, Collection<CreatedCommitContributionGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedCommitContributionEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedCommitContributionEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CreatedCommitContributionGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedCommitContributionGQO> nodes) {
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