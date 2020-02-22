package io.github.conanchen.personorg.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.personorg.graphql.api.Query;
import io.github.conanchen.personorg.graphql.model.GeneralOrganizationGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;


@Service
public class PersonorgQueriesResolver implements Query , GraphQLQueryResolver {

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