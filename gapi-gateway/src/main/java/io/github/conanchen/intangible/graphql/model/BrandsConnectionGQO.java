package io.github.conanchen.intangible.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class BrandsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<BrandsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<BrandGQO> films;

    public BrandsConnectionGQO() {
    }

    public BrandsConnectionGQO(PageInfoGQO pageInfo, Collection<BrandsEdgeGQO> edges, Integer totalCount, Collection<BrandGQO> films) {
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

    public Collection<BrandsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<BrandsEdgeGQO> edges) {
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