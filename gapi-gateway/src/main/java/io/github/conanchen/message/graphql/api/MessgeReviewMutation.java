package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessgeReviewMutation {

    MessagePayloadGQO messgeReview(String messageId, MessageReviewInputGQO input) throws Exception;

}