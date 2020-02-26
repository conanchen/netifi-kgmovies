package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationsConnectionGQO;

public interface AllConversationsQuery {

    ConversationsConnectionGQO allConversations(String after, Integer first, String before, Integer last) throws Exception;

}