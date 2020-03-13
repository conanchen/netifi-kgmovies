package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationAddMutation {

    AddConversationPayloadGQO conversationAdd(AddConversationInputGQO input) throws Exception;

}