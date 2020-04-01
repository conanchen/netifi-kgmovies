package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.AcceptActionGQO;

public interface AcceptActionQuery {

    AcceptActionGQO acceptAction(String id, String actionId) throws Exception;

}