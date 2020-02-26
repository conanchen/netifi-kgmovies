package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessgeCommentDeleteMutation {

    MessagePayloadGQO messgeCommentDelete(String messageId, MessageCommentInputGQO input) throws Exception;

}