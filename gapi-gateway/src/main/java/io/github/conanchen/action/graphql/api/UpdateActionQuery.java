package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.UpdateActionGQO;

public interface UpdateActionQuery {

    UpdateActionGQO updateAction(String id, String actionId) throws Exception;

}