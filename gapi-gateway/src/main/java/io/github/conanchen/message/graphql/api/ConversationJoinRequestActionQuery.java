package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationJoinRequestActionGQO;

public interface ConversationJoinRequestActionQuery {

    ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID) throws Exception;

}