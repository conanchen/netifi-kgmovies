package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationInvitationAcceptInputGQO;
import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;

public interface ConversationInvitationAcceptMutation {

    ConversationPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input) throws Exception;

}