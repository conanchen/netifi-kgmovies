package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationInvitationRequestActionQuery {

    ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID) throws Exception;

}