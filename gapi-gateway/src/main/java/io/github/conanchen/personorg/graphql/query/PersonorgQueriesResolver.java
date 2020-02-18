package io.github.conanchen.personorg.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.personorg.graphql.api.Query;
import io.github.conanchen.personorg.graphql.model.DefaultOrganizationGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;


@Service
public class PersonorgQueriesResolver implements Query , GraphQLQueryResolver {

	@Override
	public OrganizationGQO organization(final String id, final String organizationID) throws Exception {
		return null;
	}

  @Override
  public DefaultOrganizationGQO defaultOrganization(String id, String organizationID)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}