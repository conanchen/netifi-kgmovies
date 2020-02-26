package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessageQuery {

    MessageGQO message(String id, String msgID) throws Exception;

}