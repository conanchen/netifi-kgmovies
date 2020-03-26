package io.github.conanchen.shoppingcart.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingcart.graphql.api.Query;
import io.github.conanchen.shoppingcart.graphql.model.*;
import org.springframework.stereotype.Service;



@Service
public class ShoppingCartQueriesResolver implements Query, GraphQLQueryResolver {


  @Override
  public CartGQO cart(String id, CurrencyInputGQO currency, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PoderGQO poder(String id, String poderID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutGQO checkout(String id, String checkoutID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PostalAddressGQO postalAddress(String id, String paID, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}