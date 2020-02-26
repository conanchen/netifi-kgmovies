package io.github.conanchen.zommon.graphql.model;

import io.github.conanchen.message.graphql.model.ConversationGQO;

import java.util.Collection;

public interface ConversationalThingGQO {

    Collection<ConversationGQO> getAvailableConversations();

    ConversationGQO getDefaultConversation();

}