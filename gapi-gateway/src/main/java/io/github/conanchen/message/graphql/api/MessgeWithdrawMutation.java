package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.MessagePayloadGQO;

public interface MessgeWithdrawMutation {

    MessagePayloadGQO messgeWithdraw(String messageId) throws Exception;

}