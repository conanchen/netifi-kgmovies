package io.github.conanchen.shoppingdoor.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.shoppingdoor.graphql.api.Query;
import io.github.conanchen.shoppingdoor.graphql.model.DemandGQO;
import io.github.conanchen.shoppingdoor.graphql.model.FoodServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GeneralProductGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GeneralServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GovernmentServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.HousekeepingServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ItemCategoryGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingdoor.graphql.model.PostalAddressGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductsConnectionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ServicesConnectionGQO;


@Service
public class ShoppingQueriesResolver implements Query, GraphQLQueryResolver {

  @Override
  public ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ProductGQO product(String id, String ProductID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ServiceGQO service(String id, String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FoodServiceGQO foodService(String id, String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GeneralServiceGQO generalService(String id, String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GovernmentServiceGQO governmentService(String id, String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ItemCategoryGQO itemCategory(String id, String itcgID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GeneralProductGQO generalProduct(String id, String productID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ServicesConnectionGQO allServices(String after, Integer first, String before, Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HousekeepingServiceGQO housekeepingService(String id, String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OfferGQO offer(String id, String offerID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DemandGQO demand(String id, String demandID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PostalAddressGQO postalAddress(String id, String paID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}