package io.github.conanchen.message.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.ConversationsConnectionGQO;
import io.github.conanchen.message.graphql.model.OrganizationGQO;


@Service
public class MessageQueriesResolver implements Query , GraphQLQueryResolver {

	@Override
	public OrganizationGQO organization(final String id, final String organizationID) throws Exception {
		return null;
	}


	public ConversationsConnectionGQO allConversations(final String after, final Integer first, final String before, final Integer last) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}