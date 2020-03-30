package io.github.conanchen.person.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.organization.graphql.model.MemberRoleGQO;
import io.github.conanchen.person.graphql.api.Resolvers;
import io.github.conanchen.person.graphql.model.PersonGQO;
import org.springframework.stereotype.Service;

@Service
class PersonResolver implements Resolvers.Person,GraphQLResolver<PersonGQO> {


    @Override
    public Connection<MemberRoleGQO> membersOfPage(PersonGQO parent, String after, Integer first, String before, Integer last, String orgId, DataFetchingEnvironment env) {
        return null;
    }
}