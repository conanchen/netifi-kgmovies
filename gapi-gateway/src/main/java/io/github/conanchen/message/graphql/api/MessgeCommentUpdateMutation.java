package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessgeCommentUpdateMutation {

    MessagePayloadGQO messgeCommentUpdate(String messageId, MessageCommentInputGQO input) throws Exception;

}