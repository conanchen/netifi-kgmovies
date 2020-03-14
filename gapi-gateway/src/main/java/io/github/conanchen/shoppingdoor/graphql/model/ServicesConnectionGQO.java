package io.github.conanchen.shoppingdoor.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class ServicesConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<ServicesEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ServiceGQO> services;

    public ServicesConnectionGQO() {
    }

    public ServicesConnectionGQO(PageInfo pageInfo, Collection<ServicesEdgeGQO> edges, Integer totalCount, Collection<ServiceGQO> services) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.services = services;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<ServicesEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ServicesEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<ServiceGQO> getServices() {
        return services;
    }
    public void setServices(Collection<ServiceGQO> services) {
        this.services = services;
    }

}