package io.github.conanchen.place.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.model.EmployeeRoleGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import io.github.conanchen.place.graphql.api.Resolvers;
import io.github.conanchen.place.graphql.model.EldercareGQO;
import org.springframework.stereotype.Service;

@Service
class EldercareResolver implements Resolvers.Eldercare, GraphQLResolver<EldercareGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(EldercareGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(EldercareGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}