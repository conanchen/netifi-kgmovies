package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.DeleteActionGQO;

public interface DeleteActionQuery {

    DeleteActionGQO deleteAction(String id, String actionId) throws Exception;

}