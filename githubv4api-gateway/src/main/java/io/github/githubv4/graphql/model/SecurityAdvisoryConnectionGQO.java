package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryConnectionGQO {

    private Collection<SecurityAdvisoryEdgeGQO> edges;
    private Collection<SecurityAdvisoryGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public SecurityAdvisoryConnectionGQO() {
    }

    public SecurityAdvisoryConnectionGQO(Collection<SecurityAdvisoryEdgeGQO> edges, Collection<SecurityAdvisoryGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SecurityAdvisoryEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SecurityAdvisoryEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<SecurityAdvisoryGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SecurityAdvisoryGQO> nodes) {
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