package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessgeReviewUpdateMutation {

    MessagePayloadGQO messgeReviewUpdate(String messageId, MessageReviewInputGQO input) throws Exception;

}