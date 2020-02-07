package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface UpdateActionQuery {

    UpdateActionGQO updateAction(String id, String updateActionID) throws Exception;

}