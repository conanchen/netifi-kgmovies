package io.github.conanchen.action.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.github.conanchen.action.graphql.api.Query;
import io.github.conanchen.action.graphql.model.*;
import org.springframework.stereotype.Service;



@Service
public class ActionQueriesResolver implements Query , GraphQLQueryResolver {

  @Override
  public CreateActionGQO createAction(String id, String createActionID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReadActionGQO readAction(String id, String actionId) throws Exception {
    return null;
  }

  @Override
  public UpdateActionGQO updateAction(String id, String updateActionID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DeleteActionGQO deleteAction(String id, String actionId) throws Exception {
    return null;
  }

  @Override
  public TransferActionGQO transferAction(String id, String actionId) throws Exception {
    return null;
  }

  @Override
  public AuthorizeActionGQO authorizeAction(String id, String actionId) throws Exception {
    return null;
  }

  @Override
  public AssignActionGQO assignAction(String id, String actionId) throws Exception {
    return null;
  }

  @Override
  public RejectActionGQO rejectAction(String id, String actionId) throws Exception {
    return null;
  }

  @Override
  public AcceptActionGQO acceptAction(String id, String actionId) throws Exception {
    return null;
  }


}