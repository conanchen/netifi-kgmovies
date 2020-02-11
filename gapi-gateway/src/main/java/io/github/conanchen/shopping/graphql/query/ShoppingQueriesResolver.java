package io.github.conanchen.shopping.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.shopping.graphql.api.Query;
import io.github.conanchen.shopping.graphql.model.ProductGQO;
import io.github.conanchen.shopping.graphql.model.ProductsConnectionGQO;

@Service
public class ShoppingQueriesResolver implements Query, GraphQLQueryResolver {

  @Override
  public ProductsConnectionGQO allProducts(String after, Integer first, String before, Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ProductGQO Product(String id, String ProductID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}