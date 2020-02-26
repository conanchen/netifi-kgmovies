package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationInvitationRequestMutation {

    ConversationPayloadGQO conversationInvitationRequest(ConversationInvitationRequestInputGQO input) throws Exception;

}