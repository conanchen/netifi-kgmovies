package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.MessagePayloadGQO;
import io.github.conanchen.message.graphql.model.MessageSendInputGQO;

public interface MessgeSendMutation {

    MessagePayloadGQO messgeSend(String conversationId, MessageSendInputGQO input) throws Exception;

}