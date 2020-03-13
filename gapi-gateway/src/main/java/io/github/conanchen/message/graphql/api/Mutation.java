package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.*;

public interface Mutation {

    AddConversationPayloadGQO conversationAdd(AddConversationInputGQO input) throws Exception;

    ConversationPayloadGQO conversationJoinRequest(ConversationJoinRequestInputGQO input) throws Exception;

    ConversationPayloadGQO conversationJoinApprove(ConversationJoinApproveInputGQO input) throws Exception;

    ConversationPayloadGQO conversationInvitationRequest(ConversationInvitationRequestInputGQO input) throws Exception;

    ConversationPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input) throws Exception;

    ConversationPayloadGQO conversationMemberRemove(ConversationMemberRemoveInputGQO input) throws Exception;

    ConversationPayloadGQO conversationWebhookCreate(ConversationWebhookCreateInputGQO input) throws Exception;

    MessagePayloadGQO messgeSend(String conversationId, MessageSendInputGQO input) throws Exception;

    MessagePayloadGQO messgeWithdraw(String messageId) throws Exception;

    MessagePayloadGQO messgeReview(String messageId, MessageReviewInputGQO input) throws Exception;

    MessagePayloadGQO messgeReviewUpdate(String messageId, MessageReviewInputGQO input) throws Exception;

    MessagePayloadGQO messgeReviewDelete(String messageId, MessageReviewInputGQO input) throws Exception;

}