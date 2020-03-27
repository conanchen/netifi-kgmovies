package io.github.conanchen.intangible.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class BrandConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<BrandEdgeGQO> edges;
    private Integer totalCount;
    private Collection<BrandGQO> films;

    public BrandConnectionGQO() {
    }

    public BrandConnectionGQO(PageInfo pageInfo, Collection<BrandEdgeGQO> edges, Integer totalCount, Collection<BrandGQO> films) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.films = films;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<BrandEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<BrandEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<BrandGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<BrandGQO> films) {
        this.films = films;
    }

}