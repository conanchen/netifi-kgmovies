package io.github.conanchen.place.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.organization.graphql.model.EmployeeRoleConnectionGQO;
import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import io.github.conanchen.place.graphql.model.ChildcareGQO;
import org.springframework.stereotype.Service;

@Service
class ChildcareResolver implements GraphQLResolver<ChildcareGQO> {

    public EmployeeRoleConnectionGQO employeesPage(ChildcareGQO childcareGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        return null;
    }

    public MemberRoleConnectionGQO membersPage(ChildcareGQO childcareGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}