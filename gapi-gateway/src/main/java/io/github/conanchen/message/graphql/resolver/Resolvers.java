package io.github.conanchen.message.graphql.resolver;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.movies.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.message.graphql.api.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface DataCatalog {
    // KK
    }
    public interface Conversation {
    // KK
    }
    public interface Message {
    // KK
    }
    public interface Review {
    // KK
    }
    public interface AggregateReview {
    // KK
    }
    public interface AddConversationPayload {
    // KK
        public Connection<ConversationGQO> conversationSearch(AddConversationPayloadGQO parent,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface ConversationAddError {
    // KK
    }
    public interface ConversationPayload {
    // KK
    }
    public interface ConversationError {
    // KK
    }
    public interface MessagePayload {
    // KK
    }
    public interface MessageError {
    // KK
    }
    public interface MessageSendAction {
    // KK
    }
    public interface MessageReviewAction {
    // KK
    }
    public interface ConversationAddAction {
    // KK
    }
    public interface ConversationJoinRequestAction {
    // KK
    }
    public interface ConversationJoinApproveAction {
    // KK
    }
    public interface ConversationInvitationRequestAction {
    // KK
    }
    public interface ConversationInvitationAcceptAction {
    // KK
    }
    public interface ConversationMemberRemoveAction {
    // KK
    }
    public interface ConversationWebhookCreateAction {
    // KK
    }
    public interface UpdateConversationPayload {
    // KK
        public Connection<ConversationGQO> conversationSearch(UpdateConversationPayloadGQO parent,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface ConversationUpdateError {
    // KK
    }
    public interface DeleteConversationPayload {
    // KK
        public Connection<ConversationGQO> conversationSearch(DeleteConversationPayloadGQO parent,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface ConversationWebhookCreatePayload {
    // KK
    }
    public interface ConversationMemberRemovePayload {
    // KK
    }
    public interface ConversationInvitationAcceptPayload {
    // KK
    }
    public interface ConversationInvitationRequestPayload {
    // KK
    }
    public interface ConversationJoinApprovePayload {
    // KK
    }
    public interface ConversationJoinRequestPayload {
    // KK
    }
}