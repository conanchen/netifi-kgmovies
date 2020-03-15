package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.movies.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;

public interface Query {
// KK
    ConversationGQO conversation(String id, String csID, DataFetchingEnvironment env) throws Exception;

    MessageGQO message(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    MessageSendActionGQO messageSendAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    MessageReviewActionGQO messageReviewAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationAddActionGQO conversationAddAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

    ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;

}