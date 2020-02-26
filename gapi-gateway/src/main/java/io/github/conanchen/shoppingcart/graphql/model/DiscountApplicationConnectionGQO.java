package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class DiscountApplicationConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<DiscountApplicationEdgeGQO> edges;
    private Integer totalCount;
    private Collection<DiscountApplicationGQO> films;

    public DiscountApplicationConnectionGQO() {
    }

    public DiscountApplicationConnectionGQO(PageInfoGQO pageInfo, Collection<DiscountApplicationEdgeGQO> edges, Integer totalCount, Collection<DiscountApplicationGQO> films) {
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