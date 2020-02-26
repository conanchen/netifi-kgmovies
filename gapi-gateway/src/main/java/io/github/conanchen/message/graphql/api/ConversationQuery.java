package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationGQO;

public interface ConversationQuery {

    ConversationGQO conversation(String id, String csID) throws Exception;

}