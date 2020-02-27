package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationInvitationConnectionGQO {

    private Collection<OrganizationInvitationEdgeGQO> edges;
    private Collection<OrganizationInvitationGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public OrganizationInvitationConnectionGQO() {
    }

    public OrganizationInvitationConnectionGQO(Collection<OrganizationInvitationEdgeGQO> edges, Collection<OrganizationInvitationGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<OrganizationInvitationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<OrganizationInvitationEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<OrganizationInvitationGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<OrganizationInvitationGQO> nodes) {
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