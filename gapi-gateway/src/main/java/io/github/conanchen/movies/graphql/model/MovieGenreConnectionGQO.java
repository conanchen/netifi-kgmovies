package io.github.conanchen.movies.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class MovieGenreConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<MovieGenreEdgeGQO> edges;
    private Integer totalCount;
    private Collection<GenreGQO> genres;

    public MovieGenreConnectionGQO() {
    }

    public MovieGenreConnectionGQO(PageInfo pageInfo, Collection<MovieGenreEdgeGQO> edges, Integer totalCount, Collection<GenreGQO> genres) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.genres = genres;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<MovieGenreEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MovieGenreEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<GenreGQO> getGenres() {
        return genres;
    }
    public void setGenres(Collection<GenreGQO> genres) {
        this.genres = genres;
    }

}