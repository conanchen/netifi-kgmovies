package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationInvitationAcceptMutation {

    ConversationPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input) throws Exception;

}