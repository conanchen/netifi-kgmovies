package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationMemberRemoveMutation {

    ConversationPayloadGQO conversationMemberRemove(ConversationMemberRemoveInputGQO input) throws Exception;

}