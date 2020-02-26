package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationInvitationRequestActionGQO;

public interface ConversationInvitationRequestActionQuery {

    ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID) throws Exception;

}