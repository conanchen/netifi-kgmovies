package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountEmailConnectionGQO {

    private Collection<EnterpriseServerUserAccountEmailEdgeGQO> edges;
    private Collection<EnterpriseServerUserAccountEmailGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseServerUserAccountEmailConnectionGQO() {
    }

    public EnterpriseServerUserAccountEmailConnectionGQO(Collection<EnterpriseServerUserAccountEmailEdgeGQO> edges, Collection<EnterpriseServerUserAccountEmailGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerUserAccountEmailEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerUserAccountEmailEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerUserAccountEmailGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerUserAccountEmailGQO> nodes) {
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