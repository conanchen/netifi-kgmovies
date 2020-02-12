package io.github.conanchen.softwareapplication.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.softwareapplication.graphql.api.Query;
import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationGQO;
import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationsConnectionGQO;


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

  
}