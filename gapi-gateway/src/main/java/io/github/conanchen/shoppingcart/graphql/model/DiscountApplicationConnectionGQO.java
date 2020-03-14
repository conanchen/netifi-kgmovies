package io.github.conanchen.shoppingcart.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class DiscountApplicationConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<DiscountApplicationEdgeGQO> edges;
    private Integer totalCount;
    private Collection<DiscountApplicationGQO> films;

    public DiscountApplicationConnectionGQO() {
    }

    public DiscountApplicationConnectionGQO(PageInfo pageInfo, Collection<DiscountApplicationEdgeGQO> edges, Integer totalCount, Collection<DiscountApplicationGQO> films) {
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

    public Collection<DiscountApplicationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DiscountApplicationEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<DiscountApplicationGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<DiscountApplicationGQO> films) {
        this.films = films;
    }

}