package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationJoinRequestMutation {

    ConversationPayloadGQO conversationJoinRequest(ConversationJoinRequestInputGQO input) throws Exception;

}