package io.github.conanchen.movies.graphql.model;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

import java.util.Collection;

public class MoviesConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<MoviesEdgeGQO> edges;
    private Integer totalCount;
    private Collection<MovieGQO> films;

    public MoviesConnectionGQO() {
    }

    public MoviesConnectionGQO(PageInfoGQO pageInfo, Collection<MoviesEdgeGQO> edges, Integer totalCount, Collection<MovieGQO> films) {
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

    public Collection<MoviesEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MoviesEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<MovieGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<MovieGQO> films) {
        this.films = films;
    }

}