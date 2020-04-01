package io.github.conanchen.place.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.place.graphql.api.Query;
import io.github.conanchen.place.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PlaceQueriesResolver implements Query, GraphQLQueryResolver {


  @Override
  public DefaultPlaceGQO defaultPlaceFind(String id, String defID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public AdministrativeAreaGQO administrativeAreaFind(String id, String defID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public Connection<StoreGQO> storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
    return null;
  }

  @Override
  public Collection<StoreGQO> storeSearch1(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public StoreGQO storeFind(String id, String storeID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public ChildcareGQO childcareFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public EldercareGQO eldercareFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public Connection<LocalBusinessGQO> localBusinessSearch(LocalBusinessFilterGQO filter, LocalBusinessOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) {
    return null;
  }

  @Override
  public LocalBusinessGQO localBusinessFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}