package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessageCommentActionQuery {

    MessageCommentActionGQO messageCommentAction(String id, String msgID) throws Exception;

}