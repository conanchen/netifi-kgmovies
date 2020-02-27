package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseAdministratorInvitationConnectionGQO {

    private Collection<EnterpriseAdministratorInvitationEdgeGQO> edges;
    private Collection<EnterpriseAdministratorInvitationGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseAdministratorInvitationConnectionGQO() {
    }

    public EnterpriseAdministratorInvitationConnectionGQO(Collection<EnterpriseAdministratorInvitationEdgeGQO> edges, Collection<EnterpriseAdministratorInvitationGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseAdministratorInvitationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseAdministratorInvitationEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseAdministratorInvitationGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseAdministratorInvitationGQO> nodes) {
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