package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface AllConversationsQuery {

    ConversationsConnectionGQO allConversations(String after, Integer first, String before, Integer last) throws Exception;

}