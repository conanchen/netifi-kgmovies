package io.github.conanchen.place.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.model.EmployeeRoleGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import io.github.conanchen.place.graphql.api.Resolvers;
import io.github.conanchen.place.graphql.model.StoreGQO;
import org.springframework.stereotype.Service;

@Service
class StoreResolver implements Resolvers.Store, GraphQLResolver<StoreGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(StoreGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(StoreGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}