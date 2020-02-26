package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationInvitationRequestInputGQO;
import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;

public interface ConversationInvitationRequestMutation {

    ConversationPayloadGQO conversationInvitationRequest(ConversationInvitationRequestInputGQO input) throws Exception;

}