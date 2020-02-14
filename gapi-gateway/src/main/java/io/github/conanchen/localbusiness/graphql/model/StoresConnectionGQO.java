package io.github.conanchen.localbusiness.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class StoresConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<StoresEdgeGQO> edges;
    private Integer totalCount;
    private Collection<StoreGQO> films;

    public StoresConnectionGQO() {
    }

    public StoresConnectionGQO(PageInfoGQO pageInfo, Collection<StoresEdgeGQO> edges, Integer totalCount, Collection<StoreGQO> films) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.films = films;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<StoresEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<StoresEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<StoreGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<StoreGQO> films) {
        this.films = films;
    }

}