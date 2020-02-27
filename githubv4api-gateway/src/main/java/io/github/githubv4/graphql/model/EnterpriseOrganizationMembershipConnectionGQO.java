package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseOrganizationMembershipConnectionGQO {

    private Collection<EnterpriseOrganizationMembershipEdgeGQO> edges;
    private Collection<OrganizationGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseOrganizationMembershipConnectionGQO() {
    }

    public EnterpriseOrganizationMembershipConnectionGQO(Collection<EnterpriseOrganizationMembershipEdgeGQO> edges, Collection<OrganizationGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseOrganizationMembershipEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseOrganizationMembershipEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<OrganizationGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<OrganizationGQO> nodes) {
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