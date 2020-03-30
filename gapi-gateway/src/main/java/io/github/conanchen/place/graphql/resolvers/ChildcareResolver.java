package io.github.conanchen.place.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.model.EmployeeRoleGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import io.github.conanchen.place.graphql.api.Resolvers;
import io.github.conanchen.place.graphql.model.ChildcareGQO;
import org.springframework.stereotype.Service;

@Service
class ChildcareResolver implements Resolvers.Childcare, GraphQLResolver<ChildcareGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(ChildcareGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(ChildcareGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}