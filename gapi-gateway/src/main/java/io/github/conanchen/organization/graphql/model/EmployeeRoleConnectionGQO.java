package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class EmployeeRoleConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<EmployeeRoleEdgeGQO> edges;
    private Integer totalCount;
    private Collection<EmployeeRoleGQO> roles;

    public EmployeeRoleConnectionGQO() {
    }

    public EmployeeRoleConnectionGQO(PageInfoGQO pageInfo, Collection<EmployeeRoleEdgeGQO> edges, Integer totalCount, Collection<EmployeeRoleGQO> roles) {
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

    public Collection<EmployeeRoleEdgeGQO> getEdges() {
        return edges;
    }

    public void setEdges(Collection<EmployeeRoleEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<EmployeeRoleGQO> getRoles() {
        return roles;
    }

    public void setRoles(Collection<EmployeeRoleGQO> roles) {
        this.roles = roles;
    }

}