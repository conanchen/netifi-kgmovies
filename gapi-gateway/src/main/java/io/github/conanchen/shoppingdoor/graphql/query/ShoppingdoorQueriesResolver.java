package io.github.conanchen.shoppingdoor.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.shoppingcart.graphql.model.PostalAddressGQO;
import io.github.conanchen.shoppingdoor.graphql.api.Query;
import io.github.conanchen.shoppingdoor.graphql.model.DemandGQO;
import io.github.conanchen.shoppingdoor.graphql.model.FoodServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GeneralProductGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GeneralServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.GovernmentServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.HousekeepingServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ItemCategoryGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductsConnectionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ServiceGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ServicesConnectionGQO;


@Service
public class ShoppingdoorQueriesResolver implements Query, GraphQLQueryResolver {

  @Override
  public ProductsConnectionGQO allProducts(final String after, final Integer first, final String before, final Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ProductGQO product(final String id, final String ProductID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ServiceGQO service(final String id, final String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FoodServiceGQO foodService(final String id, final String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GeneralServiceGQO generalService(final String id, final String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GovernmentServiceGQO governmentService(final String id, final String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ItemCategoryGQO itemCategory(final String id, final String itcgID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GeneralProductGQO generalProduct(final String id, final String productID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ServicesConnectionGQO allServices(final String after, final Integer first, final String before, final Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HousekeepingServiceGQO housekeepingService(final String id, final String serviceID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OfferGQO offer(final String id, final String offerID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DemandGQO demand(final String id, final String demandID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}