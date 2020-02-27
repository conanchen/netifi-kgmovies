package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountConnectionGQO {

    private Collection<EnterpriseServerUserAccountEdgeGQO> edges;
    private Collection<EnterpriseServerUserAccountGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseServerUserAccountConnectionGQO() {
    }

    public EnterpriseServerUserAccountConnectionGQO(Collection<EnterpriseServerUserAccountEdgeGQO> edges, Collection<EnterpriseServerUserAccountGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerUserAccountEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerUserAccountEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerUserAccountGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerUserAccountGQO> nodes) {
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