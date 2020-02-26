package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.MessageCommentActionGQO;

public interface MessageCommentActionQuery {

    MessageCommentActionGQO messageCommentAction(String id, String msgID) throws Exception;

}