package io.github.conanchen.message.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Service;

import io.github.conanchen.message.graphql.api.OrganizationQuery;
import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.OrganizationGQO;


@Service
public class MessageQueriesResolver implements Query, OrganizationQuery , GraphQLQueryResolver {

	@Override
	public OrganizationGQO organization(String id, String organizationID) throws Exception {
		return null;
	}
}