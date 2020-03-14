package io.github.conanchen.shoppingcart.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class CheckoutLineItemConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<CheckoutLineItemEdgeGQO> edges;
    private Integer totalCount;
    private Collection<CheckoutLineItemGQO> films;

    public CheckoutLineItemConnectionGQO() {
    }

    public CheckoutLineItemConnectionGQO(PageInfo pageInfo, Collection<CheckoutLineItemEdgeGQO> edges, Integer totalCount, Collection<CheckoutLineItemGQO> films) {
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

    public Collection<CheckoutLineItemEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckoutLineItemEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<CheckoutLineItemGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<CheckoutLineItemGQO> films) {
        this.films = films;
    }

}