package io.github.conanchen.message.graphql.api;

import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.message.graphql.model.*;

public interface Query {
// KK
    public Connection<ConversationGQO> allConversations(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    public Connection<ConversationGQO> conversationSearch(ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    ConversationGQO conversation(String id, String csID, DataFetchingEnvironment env) throws Exception;
    MessageGQO message(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    MessageSendActionGQO messageSendAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    MessageReviewActionGQO messageReviewAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationAddActionGQO conversationAddAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationErrorGQO conversationError(String id, String msgID, DataFetchingEnvironment env) throws Exception;
}