package io.github.conanchen.shoppingcart.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.shoppingcart.graphql.api.Query;
import io.github.conanchen.shoppingcart.graphql.model.*;
import org.springframework.stereotype.Service;



@Service
public class ShoppingCartQueriesResolver implements Query, GraphQLQueryResolver {

  @Override
  public CartGQO cart(String id, CurrencyInputGQO currency) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OrderGQO order(String id, String orderID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutGQO checkout(String id, String checkoutID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PostalAddressGQO postalAddress(String id, String paID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  
}