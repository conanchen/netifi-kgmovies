package io.github.conanchen.message.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Service;

import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.ConversationsConnectionGQO;
import io.github.conanchen.message.graphql.model.CreateActionGQO;
import io.github.conanchen.message.graphql.model.OrganizationGQO;
import io.github.conanchen.message.graphql.model.UpdateActionGQO;


@Service
public class MessageQueriesResolver implements Query , GraphQLQueryResolver {

	@Override
	public OrganizationGQO organization(String id, String organizationID) throws Exception {
		return null;
	}


	public ConversationsConnectionGQO allConversations(String after, Integer first, String before, Integer last) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CreateActionGQO createAction(String id, String createActionID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UpdateActionGQO updateAction(String id, String updateActionID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}