package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class ProductsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<ProductsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ProductGQO> films;

    public ProductsConnectionGQO() {
    }

    public ProductsConnectionGQO(PageInfoGQO pageInfo, Collection<ProductsEdgeGQO> edges, Integer totalCount, Collection<ProductGQO> films) {
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

    public Collection<ProductsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProductsEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<ProductGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<ProductGQO> films) {
        this.films = films;
    }

}