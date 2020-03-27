package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.AuthorizeActionGQO;

public interface AuthorizeActionQuery {

    AuthorizeActionGQO authorizeAction(String id, String actionId) throws Exception;

}