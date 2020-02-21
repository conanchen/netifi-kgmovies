package io.github.conanchen.creativework.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.creativework.graphql.api.Query;
import io.github.conanchen.creativework.graphql.model.BlogGQO;



@Service
public class CreativeworkQueryResolver implements Query, GraphQLQueryResolver {

  @Override
  public BlogGQO blog(String id, String blogId) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  

  
}