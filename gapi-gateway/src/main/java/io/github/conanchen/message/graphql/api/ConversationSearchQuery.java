package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationSearchQuery {

    Collection<ConversationConnectionGQO> conversationSearch(ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset) throws Exception;

}