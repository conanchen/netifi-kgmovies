package io.github.conanchen.organization.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.api.Resolvers;
import io.github.conanchen.organization.graphql.model.EmployeeRoleGQO;
import io.github.conanchen.organization.graphql.model.GeneralOrganizationGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import org.springframework.stereotype.Service;

@Service
class GeneralOrganizationResolver implements Resolvers.GeneralOrganization,GraphQLResolver<GeneralOrganizationGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(GeneralOrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(GeneralOrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}