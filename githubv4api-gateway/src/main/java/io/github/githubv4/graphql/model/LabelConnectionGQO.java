package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LabelConnectionGQO {

    private Collection<LabelEdgeGQO> edges;
    private Collection<LabelGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public LabelConnectionGQO() {
    }

    public LabelConnectionGQO(Collection<LabelEdgeGQO> edges, Collection<LabelGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<LabelEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<LabelEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<LabelGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<LabelGQO> nodes) {
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