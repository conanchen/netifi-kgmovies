package io.github.conanchen.message.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class MessageQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public ConversationConnectionGQO allConversations(String after, Integer first, String before, Integer last) throws Exception {
        return null;
    }

    @Override
    public ConversationConnectionGQO conversationSearch(ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }


    @Override
    public ConversationGQO conversation(String id, String csID) throws Exception {
        return null;
    }

    @Override
    public MessageGQO message(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public MessageSendActionGQO messageSendAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public MessageReviewActionGQO messageReviewAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public ConversationAddActionGQO conversationAddAction(String id, String msgID) throws Exception {
        return null;
    }


    @Override
    public ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID) throws Exception {
        return null;
    }

    @Override
    public ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID) throws Exception {
        return null;
    }

}