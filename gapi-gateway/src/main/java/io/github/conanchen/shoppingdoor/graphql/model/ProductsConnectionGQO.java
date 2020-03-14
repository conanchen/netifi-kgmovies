package io.github.conanchen.shoppingdoor.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class ProductsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<ProductsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ProductGQO> products;

    public ProductsConnectionGQO() {
    }

    public ProductsConnectionGQO(PageInfo pageInfo, Collection<ProductsEdgeGQO> edges, Integer totalCount, Collection<ProductGQO> products) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.products = products;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
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

    public Collection<ProductGQO> getProducts() {
        return products;
    }
    public void setProducts(Collection<ProductGQO> products) {
        this.products = products;
    }

}