package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class MemberRoleConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<MemberRoleEdgeGQO> edges;
    private Integer totalCount;
    private Collection<MemberRoleGQO> roles;

    public MemberRoleConnectionGQO() {
    }

    public MemberRoleConnectionGQO(PageInfoGQO pageInfo, Collection<MemberRoleEdgeGQO> edges, Integer totalCount, Collection<MemberRoleGQO> roles) {
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

    public Collection<MemberRoleEdgeGQO> getEdges() {
        return edges;
    }

    public void setEdges(Collection<MemberRoleEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<MemberRoleGQO> getRoles() {
        return roles;
    }

    public void setRoles(Collection<MemberRoleGQO> roles) {
        this.roles = roles;
    }

}