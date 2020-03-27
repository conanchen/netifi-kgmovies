package io.github.conanchen.movies.graphql.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.github.conanchen.movies.graphql.api.Query;
import io.github.conanchen.movies.graphql.model.MovieGQO;
import io.github.conanchen.movies.graphql.model.MoviesConnectionGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import org.springframework.stereotype.Service;

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