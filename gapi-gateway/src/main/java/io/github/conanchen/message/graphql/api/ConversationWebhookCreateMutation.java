package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationWebhookCreateMutation {

    ConversationPayloadGQO conversationWebhookCreate(ConversationWebhookCreateInputGQO input) throws Exception;

}