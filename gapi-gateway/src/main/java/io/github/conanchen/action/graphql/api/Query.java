package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.CreateActionGQO;
import io.github.conanchen.action.graphql.model.DeleteActionGQO;
import io.github.conanchen.action.graphql.model.ReadActionGQO;
import io.github.conanchen.action.graphql.model.UpdateActionGQO;

public interface Query {

    CreateActionGQO createAction(String id, String actionId) throws Exception;

    ReadActionGQO readAction(String id, String actionId) throws Exception;

    UpdateActionGQO updateAction(String id, String actionId) throws Exception;

    DeleteActionGQO deleteAction(String id, String actionId) throws Exception;

}