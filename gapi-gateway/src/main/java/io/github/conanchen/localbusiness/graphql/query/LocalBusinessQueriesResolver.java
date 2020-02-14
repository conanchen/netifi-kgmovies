package io.github.conanchen.localbusiness.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.localbusiness.graphql.api.Query;
import io.github.conanchen.localbusiness.graphql.model.ChildcareGQO;
import io.github.conanchen.localbusiness.graphql.model.EldercareGQO;
import io.github.conanchen.localbusiness.graphql.model.StoreGQO;
import io.github.conanchen.localbusiness.graphql.model.StoresConnectionGQO;



@Service
public class LocalBusinessQueriesResolver implements Query, GraphQLQueryResolver {

  @Override
  public StoresConnectionGQO allStores(final String after, final Integer first, final String before, final Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public StoreGQO store(final String id, final String storeID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  
  @Override
  public ChildcareGQO childcare(String id, String lbsID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public EldercareGQO eldercare(String id, String lbsID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  
}