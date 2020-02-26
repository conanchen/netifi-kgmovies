package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface ConversationJoinApproveMutation {

    ConversationPayloadGQO conversationJoinApprove(ConversationJoinApproveInputGQO input) throws Exception;

}