package io.github.conanchen.message.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.ConversationsConnectionGQO;


@Service
public class MessageQueriesResolver implements Query , GraphQLQueryResolver {

	

	public ConversationsConnectionGQO allConversations(final String after, final Integer first, final String before, final Integer last) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}