package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckAnnotationConnectionGQO {

    private Collection<CheckAnnotationEdgeGQO> edges;
    private Collection<CheckAnnotationGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public CheckAnnotationConnectionGQO() {
    }

    public CheckAnnotationConnectionGQO(Collection<CheckAnnotationEdgeGQO> edges, Collection<CheckAnnotationGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CheckAnnotationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckAnnotationEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<CheckAnnotationGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CheckAnnotationGQO> nodes) {
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