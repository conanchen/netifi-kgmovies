package io.github.conanchen.action.graphql.api;

import java.util.*;
import io.github.conanchen.action.graphql.model.*;

public interface Query {

    CreateActionGQO createAction(String id, String actionId) throws Exception;

    ReadActionGQO readAction(String id, String actionId) throws Exception;

    UpdateActionGQO updateAction(String id, String actionId) throws Exception;

    DeleteActionGQO deleteAction(String id, String actionId) throws Exception;

}