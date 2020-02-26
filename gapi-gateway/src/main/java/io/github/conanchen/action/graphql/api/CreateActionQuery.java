package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.CreateActionGQO;

public interface CreateActionQuery {

    CreateActionGQO createAction(String id, String actionId) throws Exception;

}