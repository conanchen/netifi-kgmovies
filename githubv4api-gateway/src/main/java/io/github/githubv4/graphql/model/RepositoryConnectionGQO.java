package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryConnectionGQO {

    private Collection<RepositoryEdgeGQO> edges;
    private Collection<RepositoryGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;
    @javax.validation.constraints.NotNull
    private Integer totalDiskUsage;

    public RepositoryConnectionGQO() {
    }

    public RepositoryConnectionGQO(Collection<RepositoryEdgeGQO> edges, Collection<RepositoryGQO> nodes, PageInfoGQO pageInfo, Integer totalCount, Integer totalDiskUsage) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalDiskUsage = totalDiskUsage;
    }

    public Collection<RepositoryEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RepositoryEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RepositoryGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RepositoryGQO> nodes) {
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

    public Integer getTotalDiskUsage() {
        return totalDiskUsage;
    }
    public void setTotalDiskUsage(Integer totalDiskUsage) {
        this.totalDiskUsage = totalDiskUsage;
    }

}