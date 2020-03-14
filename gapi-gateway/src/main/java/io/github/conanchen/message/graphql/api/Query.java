package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.*;

public interface Query {


    ConversationGQO conversation(String id, String csID) throws Exception;

    MessageGQO message(String id, String msgID) throws Exception;

    MessageSendActionGQO messageSendAction(String id, String msgID) throws Exception;

    MessageReviewActionGQO messageReviewAction(String id, String msgID) throws Exception;

    ConversationAddActionGQO conversationAddAction(String id, String msgID) throws Exception;

    ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID) throws Exception;

    ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID) throws Exception;

    ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID) throws Exception;

    ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID) throws Exception;

    ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID) throws Exception;

    ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID) throws Exception;

}