package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseUserAccountConnectionGQO {

    private Collection<EnterpriseUserAccountEdgeGQO> edges;
    private Collection<EnterpriseUserAccountGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseUserAccountConnectionGQO() {
    }

    public EnterpriseUserAccountConnectionGQO(Collection<EnterpriseUserAccountEdgeGQO> edges, Collection<EnterpriseUserAccountGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseUserAccountEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseUserAccountEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseUserAccountGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseUserAccountGQO> nodes) {
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