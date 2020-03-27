package io.github.conanchen.softwareapplication.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.github.conanchen.softwareapplication.graphql.api.Query;
import io.github.conanchen.softwareapplication.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class SoftwareapplicationQueriesResolver implements Query, GraphQLQueryResolver {

  @Override
  public SoftwareApplicationsConnectionGQO allSoftwareApplications(String after, Integer first,
      String before, Integer last) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SoftwareApplicationGQO softwareApplication(String id, String softwareApplicationID)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public WebhookGQO webhook(String id, String webhookID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Collection<WebhookConnectionGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception {
    return null;
  }

}