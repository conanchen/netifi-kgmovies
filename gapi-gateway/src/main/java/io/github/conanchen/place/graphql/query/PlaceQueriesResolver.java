package io.github.conanchen.place.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.place.graphql.api.Query;
import io.github.conanchen.place.graphql.model.*;
import org.springframework.stereotype.Service;




@Service
public class PlaceQueriesResolver implements Query, GraphQLQueryResolver {

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

  @Override
  public DefaultPlaceGQO defaultPlace(String id, String defID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public AdministrativeAreaGQO administrativeArea(String id, String defID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before,
      Integer last) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  
}