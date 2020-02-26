package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationCreateActionGQO;

public interface ConversationCreateActionQuery {

    ConversationCreateActionGQO conversationCreateAction(String id, String msgID) throws Exception;

}