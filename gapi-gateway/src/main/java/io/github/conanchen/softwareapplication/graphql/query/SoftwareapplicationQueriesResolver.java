package io.github.conanchen.softwareapplication.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.softwareapplication.graphql.api.Query;
import io.github.conanchen.softwareapplication.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class SoftwareapplicationQueriesResolver implements Query, GraphQLQueryResolver {


  @Override
  public Connection<SoftwareApplicationGQO> softwareapplicationSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
    return null;
  }

  @Override
  public SoftwareApplicationGQO softwareapplicationFind(String id, String softwareApplicationID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public WebhookGQO webhookFind(String id, String webhookID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public Connection<WebhookGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) {
    return null;
  }
}