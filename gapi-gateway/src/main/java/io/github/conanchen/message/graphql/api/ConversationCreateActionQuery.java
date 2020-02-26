package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationCreateActionQuery {

    ConversationCreateActionGQO conversationCreateAction(String id, String msgID) throws Exception;

}