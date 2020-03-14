package io.github.conanchen.movies.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class MoviesConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<MoviesEdgeGQO> edges;
    private Integer totalCount;
    private Collection<MovieGQO> films;

    public MoviesConnectionGQO() {
    }

    public MoviesConnectionGQO(PageInfo pageInfo, Collection<MoviesEdgeGQO> edges, Integer totalCount, Collection<MovieGQO> films) {
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