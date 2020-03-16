package io.github.conanchen.message.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.message.graphql.api.Query;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.UserGQO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;


@Service
public class MessageQueriesResolver implements Query, GraphQLQueryResolver {

    public Connection<ConversationGQO> allConversations(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        return new SimpleListConnection<ConversationGQO>(
                Arrays.asList(
                        ConversationGQO.builder().id("id1").alternativeHeadline("alternamte1").build(),
                        ConversationGQO.builder().id("id2").alternativeHeadline("alternamte2").build(),
                        ConversationGQO.builder().id("id3").alternativeHeadline("alternamte3").build()
                )
        ).get(env);
    }

    public Connection<ConversationGQO> conversationSearch(ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) {
        return new SimpleListConnection<ConversationGQO>(
                Arrays.asList(
                        ConversationGQO.builder().id("id1").alternativeHeadline("alternamte1").build(),
                        ConversationGQO.builder().id("id2").alternativeHeadline("alternamte2").build(),
                        ConversationGQO.builder().id("id3").alternativeHeadline("alternamte3").build()
                )
        ).get(env);
    }



    @Override
    public ConversationGQO conversation(String id, String csID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessageGQO message(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessageSendActionGQO messageSendAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public MessageReviewActionGQO messageReviewAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationAddActionGQO conversationAddAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }


    @Override
    public ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        env.getContext();
        return null;
    }

    @Override
    public ConversationErrorGQO conversationError(String id, String msgID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

}