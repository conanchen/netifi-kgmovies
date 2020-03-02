package io.github.conanchen.place.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.place.graphql.api.Query;
import io.github.conanchen.place.graphql.model.*;
import org.springframework.stereotype.Service;

@Service
public class PlaceQueriesResolver implements Query, GraphQLQueryResolver {


  @Override
  public DefaultPlaceGQO defaultPlaceFind(String id, String defID) throws Exception {
    return null;
  }

  @Override
  public AdministrativeAreaGQO administrativeAreaFind(String id, String defID) throws Exception {
    return null;
  }

  @Override
  public StoreConnectionGQO storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last) throws Exception {
    return null;
  }


  @Override
  public StoreGQO storeFind(String id, String storeID) throws Exception {
    return null;
  }

  @Override
  public ChildcareGQO childcareFind(String id, String lbsID) throws Exception {
    return null;
  }

  @Override
  public EldercareGQO eldercareFind(String id, String lbsID) throws Exception {
    return null;
  }

  @Override
  public LocalBusinessConnectionGQO localBusinessSearch(LocalBusinessFilterGQO filter, LocalBusinessOrderGQO order, Integer first, Integer offset) throws Exception {
    return null;
  }

  @Override
  public LocalBusinessGQO localBusinessFind(String id, String lbsID) throws Exception {
    return null;
  }
}