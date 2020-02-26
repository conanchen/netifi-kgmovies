package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationJoinRequestActionQuery {

    ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID) throws Exception;

}