package io.github.conanchen.taskproject.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.model.EmployeeRoleGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import io.github.conanchen.taskproject.graphql.api.Resolvers;
import io.github.conanchen.taskproject.graphql.model.ProjectGQO;
import org.springframework.stereotype.Service;

@Service
class ProjectResolver implements Resolvers.Project,GraphQLResolver<ProjectGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(ProjectGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(ProjectGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}