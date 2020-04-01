package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.TransferActionGQO;

public interface TransferActionQuery {

    TransferActionGQO transferAction(String id, String actionId) throws Exception;

}