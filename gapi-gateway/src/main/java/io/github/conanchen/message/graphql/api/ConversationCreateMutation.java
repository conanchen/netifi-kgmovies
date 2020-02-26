package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationCreateMutation {

    ConversationPayloadGQO conversationCreate(ConversationCreateInputGQO input) throws Exception;

}