package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationWebhookCreateActionGQO;

public interface ConversationWebhookCreateActionQuery {

    ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID) throws Exception;

}