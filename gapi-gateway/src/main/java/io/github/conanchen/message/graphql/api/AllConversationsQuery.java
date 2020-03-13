package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationConnectionGQO;

public interface AllConversationsQuery {

    ConversationConnectionGQO allConversations(String after, Integer first, String before, Integer last) throws Exception;

}