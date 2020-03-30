package io.github.conanchen.organization.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.api.Query;
import io.github.conanchen.organization.graphql.model.GeneralOrganizationGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import org.springframework.stereotype.Service;


@Service
public class OrganizationQueriesResolver implements Query , GraphQLQueryResolver {


    @Override
    public OrganizationGQO organization(String id, String organizationID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public GeneralOrganizationGQO generalOrganization(String id, String organizationID, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}