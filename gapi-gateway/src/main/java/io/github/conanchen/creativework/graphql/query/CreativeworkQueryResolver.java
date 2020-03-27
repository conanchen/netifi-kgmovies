package io.github.conanchen.creativework.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.github.conanchen.creativework.graphql.api.Query;
import io.github.conanchen.creativework.graphql.model.BlogGQO;
import org.springframework.stereotype.Service;



@Service
public class CreativeworkQueryResolver implements Query, GraphQLQueryResolver {

  @Override
  public BlogGQO blog(String id, String blogId) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  

  
}