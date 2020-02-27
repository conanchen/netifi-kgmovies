package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SavedReplyConnectionGQO {

    private Collection<SavedReplyEdgeGQO> edges;
    private Collection<SavedReplyGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public SavedReplyConnectionGQO() {
    }

    public SavedReplyConnectionGQO(Collection<SavedReplyEdgeGQO> edges, Collection<SavedReplyGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SavedReplyEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SavedReplyEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<SavedReplyGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SavedReplyGQO> nodes) {
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