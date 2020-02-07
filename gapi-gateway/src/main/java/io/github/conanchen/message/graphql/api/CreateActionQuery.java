package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface CreateActionQuery {

    CreateActionGQO createAction(String id, String createActionID) throws Exception;

}