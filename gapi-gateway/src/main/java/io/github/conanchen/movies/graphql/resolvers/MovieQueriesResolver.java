package io.github.conanchen.movies.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Service;

import io.github.conanchen.movies.graphql.api.Query;
import io.github.conanchen.movies.graphql.model.MovieGQO;
import io.github.conanchen.movies.graphql.model.MoviesConnectionGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

@Service
public class MovieQueriesResolver implements Query, GraphQLQueryResolver {

	@Override
	public MoviesConnectionGQO allMovies(String after, Integer first, String before, Integer last) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieGQO movie(String id, String movieID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeGQO node(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}