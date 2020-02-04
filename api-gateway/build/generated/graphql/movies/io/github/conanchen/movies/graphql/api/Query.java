package io.github.conanchen.movies.graphql.api;

import io.github.conanchen.movies.graphql.model.MovieGQO;
import io.github.conanchen.movies.graphql.model.MoviesConnectionGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public interface Query {

    MoviesConnectionGQO allMovies(String after, Integer first, String before, Integer last) throws Exception;

    MovieGQO movie(String id, String movieID) throws Exception;

    NodeGQO node(String id) throws Exception;

}