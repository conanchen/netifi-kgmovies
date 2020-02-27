package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryTopicConnectionGQO {

    private Collection<RepositoryTopicEdgeGQO> edges;
    private Collection<RepositoryTopicGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public RepositoryTopicConnectionGQO() {
    }

    public RepositoryTopicConnectionGQO(Collection<RepositoryTopicEdgeGQO> edges, Collection<RepositoryTopicGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RepositoryTopicEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RepositoryTopicEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<RepositoryTopicGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RepositoryTopicGQO> nodes) {
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