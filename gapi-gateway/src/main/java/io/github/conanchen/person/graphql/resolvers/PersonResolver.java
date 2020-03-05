package io.github.conanchen.person.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import org.springframework.stereotype.Service;

@Service
class PersonResolver implements GraphQLResolver<PersonGQO> {

    public MemberRoleConnectionGQO membersOfPage(PersonGQO personGQO, String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}