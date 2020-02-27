package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TopicConnectionGQO {

    private Collection<TopicEdgeGQO> edges;
    private Collection<TopicGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public TopicConnectionGQO() {
    }

    public TopicConnectionGQO(Collection<TopicEdgeGQO> edges, Collection<TopicGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TopicEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TopicEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<TopicGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<TopicGQO> nodes) {
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