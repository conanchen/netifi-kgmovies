package io.github.conanchen.action.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.action.graphql.api.Query;
import io.github.conanchen.action.graphql.model.CreateActionGQO;
import io.github.conanchen.action.graphql.model.DeleteActionGQO;
import io.github.conanchen.action.graphql.model.ReadActionGQO;
import io.github.conanchen.action.graphql.model.UpdateActionGQO;
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


}