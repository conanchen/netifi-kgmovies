package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.MessageGQO;

public interface MessageQuery {

    MessageGQO message(String id, String msgID) throws Exception;

}