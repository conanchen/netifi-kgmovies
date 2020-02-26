package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class CheckoutLineItemConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<CheckoutLineItemEdgeGQO> edges;
    private Integer totalCount;
    private Collection<CheckoutLineItemGQO> films;

    public CheckoutLineItemConnectionGQO() {
    }

    public CheckoutLineItemConnectionGQO(PageInfoGQO pageInfo, Collection<CheckoutLineItemEdgeGQO> edges, Integer totalCount, Collection<CheckoutLineItemGQO> films) {
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