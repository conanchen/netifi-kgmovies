package io.github.conanchen.organization.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.api.Resolvers;
import io.github.conanchen.organization.graphql.model.EmployeeRoleGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import org.springframework.stereotype.Service;

@Service
class OrganizationResolver implements Resolvers.Organization,GraphQLResolver<OrganizationGQO> {

    @Override
    public Connection<EmployeeRoleGQO> employeesPage(OrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(OrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}
