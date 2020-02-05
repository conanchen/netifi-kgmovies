package io.github.conanchen.movies.graphql.api;

import java.util.*;
import io.github.conanchen.movies.graphql.model.*;

public interface MovieQuery {

    MovieGQO movie(String id, String movieID) throws Exception;

}