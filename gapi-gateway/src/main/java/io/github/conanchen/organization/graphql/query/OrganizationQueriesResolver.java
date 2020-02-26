package io.github.conanchen.organization.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.organization.graphql.api.Query;
import io.github.conanchen.organization.graphql.model.GeneralOrganizationGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import org.springframework.stereotype.Service;


@Service
public class OrganizationQueriesResolver implements Query , GraphQLQueryResolver {

	@Override
	public OrganizationGQO organization(final String id, final String organizationID) throws Exception {
		return null;
	}

  @Override
  public GeneralOrganizationGQO generalOrganization(String id, String organizationID)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}