package io.github.conanchen.message.graphql.api;

import io.github.conanchen.message.graphql.model.MessageCommentInputGQO;
import io.github.conanchen.message.graphql.model.MessagePayloadGQO;

public interface MessgeCommentMutation {

    MessagePayloadGQO messgeComment(String messageId, MessageCommentInputGQO input) throws Exception;

}