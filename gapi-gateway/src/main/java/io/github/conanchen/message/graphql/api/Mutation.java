package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.*;

public interface Mutation {

    ConversationPayloadGQO conversationCreate(ConversationCreateInputGQO input) throws Exception;

    ConversationPayloadGQO conversationJoinRequest(ConversationJoinRequestInputGQO input) throws Exception;

    ConversationPayloadGQO conversationJoinApprove(ConversationJoinApproveInputGQO input) throws Exception;

    ConversationPayloadGQO conversationInvitationRequest(ConversationInvitationRequestInputGQO input) throws Exception;

    ConversationPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input) throws Exception;

    ConversationPayloadGQO conversationMemberRemove(ConversationMemberRemoveInputGQO input) throws Exception;

    ConversationPayloadGQO conversationWebhookCreate(ConversationWebhookCreateInputGQO input) throws Exception;

    MessagePayloadGQO messgeSend(String conversationId, MessageSendInputGQO input) throws Exception;

    MessagePayloadGQO messgeWithdraw(String messageId) throws Exception;

    MessagePayloadGQO messgeComment(String messageId, MessageCommentInputGQO input) throws Exception;

    MessagePayloadGQO messgeCommentUpdate(String messageId, MessageCommentInputGQO input) throws Exception;

    MessagePayloadGQO messgeCommentDelete(String messageId, MessageCommentInputGQO input) throws Exception;

}