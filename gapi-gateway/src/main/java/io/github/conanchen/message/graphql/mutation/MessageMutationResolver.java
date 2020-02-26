package io.github.conanchen.message.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.message.graphql.api.Mutation;
import io.github.conanchen.message.graphql.model.*;
import org.springframework.stereotype.Service;

@Service
public class MessageMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public ConversationPayloadGQO conversationCreate(ConversationCreateInputGQO input) throws Exception {
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
  public MessagePayloadGQO messgeSend(String conversationId, MessageSendInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messgeWithdraw(String messageId) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messgeComment(String messageId, MessageCommentInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messgeCommentUpdate(String messageId, MessageCommentInputGQO input) throws Exception {
    return null;
  }

  @Override
  public MessagePayloadGQO messgeCommentDelete(String messageId, MessageCommentInputGQO input) throws Exception {
    return null;
  }
}