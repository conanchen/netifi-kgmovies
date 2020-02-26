package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.ConversationJoinApproveInputGQO;
import io.github.conanchen.message.graphql.model.ConversationPayloadGQO;

public interface ConversationJoinApproveMutation {

    ConversationPayloadGQO conversationJoinApprove(ConversationJoinApproveInputGQO input) throws Exception;

}