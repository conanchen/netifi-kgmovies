package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class MembershipConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<MembershipEdgeGQO> edges;
    private Integer totalCount;
    private Collection<MembershipGQO> roles;

    public MembershipConnectionGQO() {
    }

    public MembershipConnectionGQO(PageInfoGQO pageInfo, Collection<MembershipEdgeGQO> edges, Integer totalCount, Collection<MembershipGQO> roles) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.roles = roles;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<MembershipEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MembershipEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<MembershipGQO> getRoles() {
        return roles;
    }
    public void setRoles(Collection<MembershipGQO> roles) {
        this.roles = roles;
    }

}