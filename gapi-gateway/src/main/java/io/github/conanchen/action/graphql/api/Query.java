package io.github.conanchen.action.graphql.api;

import io.github.conanchen.action.graphql.model.*;

public interface Query {

    CreateActionGQO createAction(String id, String actionId) throws Exception;

    ReadActionGQO readAction(String id, String actionId) throws Exception;

    UpdateActionGQO updateAction(String id, String actionId) throws Exception;

    DeleteActionGQO deleteAction(String id, String actionId) throws Exception;

    TransferActionGQO transferAction(String id, String actionId) throws Exception;

    AuthorizeActionGQO authorizeAction(String id, String actionId) throws Exception;

    AssignActionGQO assignAction(String id, String actionId) throws Exception;

    RejectActionGQO rejectAction(String id, String actionId) throws Exception;

    AcceptActionGQO acceptAction(String id, String actionId) throws Exception;

}