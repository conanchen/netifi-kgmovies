package io.github.conanchen.action.graphql.api;

import java.util.*;
import io.github.conanchen.action.graphql.model.*;

public interface UpdateActionQuery {

    UpdateActionGQO updateAction(String id, String updateActionID) throws Exception;

}