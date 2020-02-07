package io.github.conanchen.movies.graphql.api;

import io.github.conanchen.movies.graphql.model.MovieGQO;

public interface MovieQuery {

    MovieGQO movie(String id, String movieID) throws Exception;

}