package io.github.conanchen.taskproject.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.organization.graphql.model.EmployeeRoleConnectionGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import io.github.conanchen.taskproject.graphql.model.ProjectGQO;
import org.springframework.stereotype.Service;

@Service
class ProjectResolver implements GraphQLResolver<ProjectGQO> {

    public EmployeeRoleConnectionGQO employeesPage(ProjectGQO projectGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        return null;
    }

    public MemberRoleConnectionGQO membersPage(ProjectGQO projectGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}