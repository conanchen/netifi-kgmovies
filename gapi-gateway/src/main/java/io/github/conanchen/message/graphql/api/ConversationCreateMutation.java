package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationCreateInputGQO;
import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;

public interface ConversationCreateMutation {

    ConversationPayloadGQO conversationCreate(ConversationCreateInputGQO input) throws Exception;

}