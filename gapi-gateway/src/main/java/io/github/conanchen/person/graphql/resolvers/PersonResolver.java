package io.github.conanchen.person.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.person.graphql.resolver.Resolvers;
import org.springframework.stereotype.Service;

@Service
class PersonResolver implements Resolvers.Person,GraphQLResolver<PersonGQO> {

    @Override
    public MemberRoleConnectionGQO membersOfPage(PersonGQO parent, String after, Integer first, String before, Integer last, String orgId, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}