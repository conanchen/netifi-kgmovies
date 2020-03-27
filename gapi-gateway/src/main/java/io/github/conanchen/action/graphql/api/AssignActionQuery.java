package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.AssignActionGQO;

public interface AssignActionQuery {

    AssignActionGQO assignAction(String id, String actionId) throws Exception;

}