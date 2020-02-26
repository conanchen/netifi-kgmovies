package io.github.conanchen.place.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class LocalBusinessConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<LocalBusinessEdgeGQO> edges;
    private Integer totalCount;
    private Collection<LocalBusinessGQO> localBusiness;

    public LocalBusinessConnectionGQO() {
    }

    public LocalBusinessConnectionGQO(PageInfoGQO pageInfo, Collection<LocalBusinessEdgeGQO> edges, Integer totalCount, Collection<LocalBusinessGQO> localBusiness) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.localBusiness = localBusiness;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
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