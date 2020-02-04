package io.github.conanchen.movies.graphql.api;

import java.util.*;
import io.github.conanchen.movies.graphql.model.*;

public interface AllMoviesQuery {

    MoviesConnectionGQO allMovies(String after, Integer first, String before, Integer last) throws Exception;

}