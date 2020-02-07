package io.github.conanchen.movies.graphql.api;

import io.github.conanchen.movies.graphql.model.MoviesConnectionGQO;

public interface AllMoviesQuery {

    MoviesConnectionGQO allMovies(String after, Integer first, String before, Integer last) throws Exception;

}