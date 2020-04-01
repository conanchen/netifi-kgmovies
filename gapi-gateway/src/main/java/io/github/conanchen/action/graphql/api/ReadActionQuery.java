package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.ReadActionGQO;

public interface ReadActionQuery {

    ReadActionGQO readAction(String id, String actionId) throws Exception;

}