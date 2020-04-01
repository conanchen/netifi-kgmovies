package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.RejectActionGQO;

public interface RejectActionQuery {

    RejectActionGQO rejectAction(String id, String actionId) throws Exception;

}