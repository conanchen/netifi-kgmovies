package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationAuditEntryConnectionGQO {

    private Collection<OrganizationAuditEntryEdgeGQO> edges;
    private Collection<OrganizationAuditEntryGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public OrganizationAuditEntryConnectionGQO() {
    }

    public OrganizationAuditEntryConnectionGQO(Collection<OrganizationAuditEntryEdgeGQO> edges, Collection<OrganizationAuditEntryGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<OrganizationAuditEntryEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<OrganizationAuditEntryEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<OrganizationAuditEntryGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<OrganizationAuditEntryGQO> nodes) {
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