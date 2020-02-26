package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;
import io.github.conanchen.message.graphql.model.ConversationWebhookCreateInputGQO;

public interface ConversationWebhookCreateMutation {

    ConversationPayloadGQO conversationWebhookCreate(ConversationWebhookCreateInputGQO input) throws Exception;

}