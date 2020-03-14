package io.github.conanchen.message.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.message.graphql.api.Mutation;
import io.github.conanchen.message.graphql.model.*;
import org.springframework.stereotype.Service;

@Service
public class MessageMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public AddConversationPayloadGQO conversationAdd(AddConversationInputGQO input) throws Exception {
    return null;
  }

  @Override
  public UpdateConversationPayloadGQO conversationUpdate(UpdateConversationInputGQO input) throws Exception {
    return null;
  }

  @Override
  public DeleteConversationPayloadGQO conversationDelete(ConversationFilterGQO filter) throws Exception {
    return null;
  }

  @Override
  public ConversationPayloadGQO conversationJoinRequest(ConversationJoinRequestInputGQO input) throws Exception {
    return null;
  }

  @Override
  public ConversationPayloadGQO conversationJoinApprove(ConversationJoinApproveInputGQO input) throws Exception {
    return null;
  }

  @Override
  public ConversationPayloadGQO conversationInvitationRequest(ConversationInvitationRequestInputGQO input) throws Exception {
    return null;
  }

  @Override
  public ConversationPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input) throws Exception {
    return null;
  }

  @Override
  public ConversationPayloadGQO conversationMemberRemove(ConversationMemberRemoveInputGQO input) throws Exception {
    return null;
  }

  @Override
  public ConversationPayloadGQO conversationWebhookCreate(ConversationWebhookCreateInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messageSend(String conversationId, MessageSendInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messageWithdraw(String messageId) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messageReview(String messageId, MessageReviewInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messageReviewUpdate(String messageId, MessageReviewInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messageReviewDelete(String messageId, MessageReviewInputGQO input) throws Exception {
    return null;
  }


}