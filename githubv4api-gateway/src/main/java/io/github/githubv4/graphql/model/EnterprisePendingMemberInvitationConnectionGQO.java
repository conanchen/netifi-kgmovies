package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterprisePendingMemberInvitationConnectionGQO {

    private Collection<EnterprisePendingMemberInvitationEdgeGQO> edges;
    private Collection<OrganizationInvitationGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;
    @javax.validation.constraints.NotNull
    private Integer totalUniqueUserCount;

    public EnterprisePendingMemberInvitationConnectionGQO() {
    }

    public EnterprisePendingMemberInvitationConnectionGQO(Collection<EnterprisePendingMemberInvitationEdgeGQO> edges, Collection<OrganizationInvitationGQO> nodes, PageInfoGQO pageInfo, Integer totalCount, Integer totalUniqueUserCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalUniqueUserCount = totalUniqueUserCount;
    }

    public Collection<EnterprisePendingMemberInvitationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterprisePendingMemberInvitationEdgeGQO> edges) {
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

    public Integer getTotalUniqueUserCount() {
        return totalUniqueUserCount;
    }
    public void setTotalUniqueUserCount(Integer totalUniqueUserCount) {
        this.totalUniqueUserCount = totalUniqueUserCount;
    }

}