package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PublicKeyConnectionGQO {

    private Collection<PublicKeyEdgeGQO> edges;
    private Collection<PublicKeyGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public PublicKeyConnectionGQO() {
    }

    public PublicKeyConnectionGQO(Collection<PublicKeyEdgeGQO> edges, Collection<PublicKeyGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PublicKeyEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PublicKeyEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<PublicKeyGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PublicKeyGQO> nodes) {
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