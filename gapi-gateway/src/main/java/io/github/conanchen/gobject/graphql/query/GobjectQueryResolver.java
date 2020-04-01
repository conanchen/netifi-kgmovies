package io.github.conanchen.gobject.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.gobject.graphql.api.Query;
import io.github.conanchen.gobject.graphql.model.*;
import org.springframework.stereotype.Service;


@Service
public class GobjectQueryResolver implements Query, GraphQLQueryResolver {


  @Override
  public GxcelObjectGQO gxcel(String id, String gxcelID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public GeneralObjectGQO generalObject(String id, String gID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public ImageObjectGQO imageObject(String id, String gID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public AudioObjectGQO audioObject(String id, String gID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public VideoObjectGQO videoObject(String id, String gID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public GObjectGQO gobject(String id, String gobjectID, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}