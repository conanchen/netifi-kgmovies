package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestChangedFileConnectionGQO {

    private Collection<PullRequestChangedFileEdgeGQO> edges;
    private Collection<PullRequestChangedFileGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PullRequestChangedFileConnectionGQO() {
    }

    public PullRequestChangedFileConnectionGQO(Collection<PullRequestChangedFileEdgeGQO> edges, Collection<PullRequestChangedFileGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestChangedFileEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestChangedFileEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestChangedFileGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestChangedFileGQO> nodes) {
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