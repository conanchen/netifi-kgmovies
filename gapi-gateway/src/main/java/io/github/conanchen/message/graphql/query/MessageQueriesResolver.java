package io.github.conanchen.message.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.*;
import org.springframework.stereotype.Service;


@Service
public class MessageQueriesResolver implements Query , GraphQLQueryResolver {

	

	public ConversationsConnectionGQO allConversations(final String after, final Integer first, final String before, final Integer last) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConversationGQO conversation(String id, String csID) throws Exception {
		return null;
	}

	@Override
	public MessageGQO message(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public MessageSendActionGQO messageSendAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public MessageCommentActionGQO messageCommentAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationCreateActionGQO conversationCreateAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID) throws Exception {
		return null;
	}

	@Override
	public ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID) throws Exception {
		return null;
	}

}