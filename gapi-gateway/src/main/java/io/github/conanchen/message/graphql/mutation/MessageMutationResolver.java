package io.github.conanchen.message.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.message.graphql.api.Mutation;
import io.github.conanchen.message.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MessageMutationResolver implements Mutation, GraphQLMutationResolver {

    @Override
    public AddConversationPayloadGQO conversationAdd(AddConversationInputGQO input, DataFetchingEnvironment env) throws Exception {
        return AddConversationPayloadGQO.builder()
                .item(ConversationGQO.builder()
                        .headline("headline")
                        .alternativeHeadline("alter")
                        .id("idconver1")
                        .build())
                .errors(Collections.singleton(ConversationAddErrorGQO.builder()
                        .code(ConversationAddErrorCodeGQO.ACTION_NOT_PERMITTED)
                        .message("testing error")
                        .build()))
                .build();
    }

    @Override
    public UpdateConversationPayloadGQO conversationUpdate(String conversationId, UpdateConversationInputGQO input, DataFetchingEnvironment env) throws Exception {
        return UpdateConversationPayloadGQO.builder()
                .item(ConversationGQO.builder()
                        .headline("headline")
                        .alternativeHeadline("alter")
                        .id("idconver1")
                        .build())
                .errors(Collections.singleton(ConversationUpdateErrorGQO.builder()
                        .code(ConversationUpdateErrorCodeGQO.ACTION_NOT_PERMITTED)
                        .message("testing error")
                        .build()))
                .build();
    }

    @Override
    public DeleteConversationPayloadGQO conversationDelete(String conversationId, ConversationFilterGQO filter, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationJoinRequestPayloadGQO conversationJoinRequest(String conversationId, ConversationJoinRequestInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationJoinApprovePayloadGQO conversationJoinApprove(String conversationId, ConversationJoinApproveInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationInvitationRequestPayloadGQO conversationInvitationRequest(String conversationId, ConversationInvitationRequestInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationInvitationAcceptPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationMemberAddPayloadGQO conversationMemberAdd(String conversationId, ConversationMemberAddInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationMemberRemovePayloadGQO conversationMemberRemove(String conversationId, ConversationMemberRemoveInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationWebhookCreatePayloadGQO conversationWebhookCreate(String conversationId, ConversationWebhookCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessagePayloadGQO messageSend(String conversationId, MessageSendInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessagePayloadGQO messageWithdraw(String messageId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessagePayloadGQO messageReviewAdd(String messageId, MessageReviewInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessagePayloadGQO messageReviewUpdate(String reviewId, MessageReviewInputGQO input, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessagePayloadGQO messageReviewDelete(String reviewId, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}