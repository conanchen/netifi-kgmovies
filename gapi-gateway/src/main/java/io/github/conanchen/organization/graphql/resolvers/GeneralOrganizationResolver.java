package io.github.conanchen.organization.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.organization.graphql.model.EmployeeRoleConnectionGQO;
import io.github.conanchen.organization.graphql.model.GeneralOrganizationGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import org.springframework.stereotype.Service;

@Service
class GeneralOrganizationResolver implements GraphQLResolver<GeneralOrganizationGQO> {

    public EmployeeRoleConnectionGQO employeesPage(GeneralOrganizationGQO generalOrganizationGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        return null;
    }

    public MemberRoleConnectionGQO membersPage(GeneralOrganizationGQO generalOrganizationGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}