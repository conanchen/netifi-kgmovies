package io.github.conanchen.place.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class LocalBusinessConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<LocalBusinessEdgeGQO> edges;
    private Integer totalCount;
    private Collection<LocalBusinessGQO> localBusiness;

    public LocalBusinessConnectionGQO() {
    }

    public LocalBusinessConnectionGQO(PageInfo pageInfo, Collection<LocalBusinessEdgeGQO> edges, Integer totalCount, Collection<LocalBusinessGQO> localBusiness) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.localBusiness = localBusiness;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<LocalBusinessEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<LocalBusinessEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<LocalBusinessGQO> getLocalBusiness() {
        return localBusiness;
    }
    public void setLocalBusiness(Collection<LocalBusinessGQO> localBusiness) {
        this.localBusiness = localBusiness;
    }

}