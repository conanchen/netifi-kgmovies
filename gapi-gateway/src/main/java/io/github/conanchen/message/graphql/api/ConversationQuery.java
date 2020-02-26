package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationQuery {

    ConversationGQO conversation(String id, String csID) throws Exception;

}