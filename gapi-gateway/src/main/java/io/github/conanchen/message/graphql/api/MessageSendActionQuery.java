package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.MessageSendActionGQO;

public interface MessageSendActionQuery {

    MessageSendActionGQO messageSendAction(String id, String msgID) throws Exception;

}