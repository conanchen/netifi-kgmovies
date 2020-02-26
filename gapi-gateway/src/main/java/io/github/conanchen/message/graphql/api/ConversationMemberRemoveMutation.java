package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationMemberRemoveInputGQO;
import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;

public interface ConversationMemberRemoveMutation {

    ConversationPayloadGQO conversationMemberRemove(ConversationMemberRemoveInputGQO input) throws Exception;

}