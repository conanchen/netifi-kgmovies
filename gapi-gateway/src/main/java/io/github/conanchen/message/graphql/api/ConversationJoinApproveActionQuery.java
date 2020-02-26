package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationJoinApproveActionGQO;

public interface ConversationJoinApproveActionQuery {

    ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID) throws Exception;

}