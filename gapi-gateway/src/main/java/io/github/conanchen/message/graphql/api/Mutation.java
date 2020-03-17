package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.movies.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Mutation {
// KK
    AddConversationPayloadGQO conversationAdd(AddConversationInputGQO input, DataFetchingEnvironment env) throws Exception;
    UpdateConversationPayloadGQO conversationUpdate(String conversationId, UpdateConversationInputGQO input, DataFetchingEnvironment env) throws Exception;
    DeleteConversationPayloadGQO conversationDelete(String conversationId, ConversationFilterGQO filter, DataFetchingEnvironment env) throws Exception;
    ConversationJoinRequestPayloadGQO conversationJoinRequest(String conversationId, ConversationJoinRequestInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationJoinApprovePayloadGQO conversationJoinApprove(String conversationId, ConversationJoinApproveInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationRequestPayloadGQO conversationInvitationRequest(String conversationId, ConversationInvitationRequestInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationAcceptPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationMemberAddPayloadGQO conversationMemberAdd(String conversationId, ConversationMemberAddInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationMemberRemovePayloadGQO conversationMemberRemove(String conversationId, ConversationMemberRemoveInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationWebhookCreatePayloadGQO conversationWebhookCreate(String conversationId, ConversationWebhookCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageSend(String conversationId, MessageSendInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageWithdraw(String messageId, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageReviewAdd(String messageId, MessageReviewInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageReviewUpdate(String reviewId, MessageReviewInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageReviewDelete(String reviewId, DataFetchingEnvironment env) throws Exception;
}