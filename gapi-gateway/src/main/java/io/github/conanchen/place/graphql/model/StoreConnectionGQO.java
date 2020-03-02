package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class StoreConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<StoreEdgeGQO> edges;
    private Integer totalCount;
    private Collection<StoreGQO> films;

    public StoreConnectionGQO() {
    }

    public StoreConnectionGQO(PageInfoGQO pageInfo, Collection<StoreEdgeGQO> edges, Integer totalCount, Collection<StoreGQO> films) {
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

    public Collection<StoreEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<StoreEdgeGQO> edges) {
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