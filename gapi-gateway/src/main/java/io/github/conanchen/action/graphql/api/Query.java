package io.github.conanchen.action.graphql.api;

import java.util.*;
import io.github.conanchen.action.graphql.model.*;

public interface Query {

    CreateActionGQO createAction(String id, String createActionID) throws Exception;

    UpdateActionGQO updateAction(String id, String updateActionID) throws Exception;

}