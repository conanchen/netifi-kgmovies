package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationMemberRemoveActionGQO;

public interface ConversationMemberRemoveActionQuery {

    ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID) throws Exception;

}