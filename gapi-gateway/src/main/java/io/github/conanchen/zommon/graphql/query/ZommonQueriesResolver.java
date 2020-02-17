package io.github.conanchen.zommon.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.zommon.graphql.api.Query;
import io.github.conanchen.zommon.graphql.model.LocalBusinessConnectionGQO;
import io.github.conanchen.zommon.graphql.model.LocalBusinessGQO;




@Service
public class ZommonQueriesResolver implements Query, GraphQLQueryResolver {

  
  @Override
  public LocalBusinessConnectionGQO allLocalBusiness(final String after, final Integer first, final String before,
      final Integer last) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalBusinessGQO localBusiness(final String id, final String lbsID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  
}