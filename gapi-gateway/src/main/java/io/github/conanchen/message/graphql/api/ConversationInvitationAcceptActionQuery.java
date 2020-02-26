package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationInvitationAcceptActionGQO;

public interface ConversationInvitationAcceptActionQuery {

    ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID) throws Exception;

}