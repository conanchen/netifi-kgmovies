package io.github.conanchen.intangible.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.intangible.graphql.api.Query;
import io.github.conanchen.intangible.graphql.model.BrandGQO;
import io.github.conanchen.intangible.graphql.model.BrandsConnectionGQO;


@Service
public class IntangibleQueryResolver implements Query, GraphQLQueryResolver {

  @Override
  public BrandsConnectionGQO allBrands(String after, Integer first, String before, Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BrandGQO brand(String id, String brandID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }


  
}