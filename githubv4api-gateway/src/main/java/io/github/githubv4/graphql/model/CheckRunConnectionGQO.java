package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunConnectionGQO {

    private Collection<CheckRunEdgeGQO> edges;
    private Collection<CheckRunGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CheckRunConnectionGQO() {
    }

    public CheckRunConnectionGQO(Collection<CheckRunEdgeGQO> edges, Collection<CheckRunGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CheckRunEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckRunEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CheckRunGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CheckRunGQO> nodes) {
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