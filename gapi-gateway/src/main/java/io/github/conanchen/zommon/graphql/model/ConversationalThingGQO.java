package io.github.conanchen.zommon.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.ConversationGQO;

public interface ConversationalThingGQO {

    Collection<ConversationGQO> getAvailableConversations();

    ConversationGQO getDefaultConversation();

}