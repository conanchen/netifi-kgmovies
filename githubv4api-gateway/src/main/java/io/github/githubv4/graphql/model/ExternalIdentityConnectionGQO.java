package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ExternalIdentityConnectionGQO {

    private Collection<ExternalIdentityEdgeGQO> edges;
    private Collection<ExternalIdentityGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ExternalIdentityConnectionGQO() {
    }

    public ExternalIdentityConnectionGQO(Collection<ExternalIdentityEdgeGQO> edges, Collection<ExternalIdentityGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ExternalIdentityEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ExternalIdentityEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ExternalIdentityGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ExternalIdentityGQO> nodes) {
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