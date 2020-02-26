package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessgeSendMutation {

    MessagePayloadGQO messgeSend(String conversationId, MessageSendInputGQO input) throws Exception;

}