package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseRepositoryInfoConnectionGQO {

    private Collection<EnterpriseRepositoryInfoEdgeGQO> edges;
    private Collection<EnterpriseRepositoryInfoGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseRepositoryInfoConnectionGQO() {
    }

    public EnterpriseRepositoryInfoConnectionGQO(Collection<EnterpriseRepositoryInfoEdgeGQO> edges, Collection<EnterpriseRepositoryInfoGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseRepositoryInfoEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseRepositoryInfoEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseRepositoryInfoGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseRepositoryInfoGQO> nodes) {
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