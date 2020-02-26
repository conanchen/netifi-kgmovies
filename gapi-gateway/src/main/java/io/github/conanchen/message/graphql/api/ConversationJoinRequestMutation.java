package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationJoinRequestInputGQO;
import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;

public interface ConversationJoinRequestMutation {

    ConversationPayloadGQO conversationJoinRequest(ConversationJoinRequestInputGQO input) throws Exception;

}