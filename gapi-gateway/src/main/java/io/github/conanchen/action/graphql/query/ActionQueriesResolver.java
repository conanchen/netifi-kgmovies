package io.github.conanchen.action.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.action.graphql.api.Query;
import io.github.conanchen.action.graphql.model.CreateActionGQO;
import io.github.conanchen.action.graphql.model.UpdateActionGQO;



@Service
public class ActionQueriesResolver implements Query , GraphQLQueryResolver {

  @Override
  public CreateActionGQO createAction(String id, String createActionID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UpdateActionGQO updateAction(String id, String updateActionID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

	

}