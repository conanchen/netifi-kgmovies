package io.github.conanchen.taskproject.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.person.graphql.model.UserGQO;
import io.github.conanchen.taskproject.graphql.api.Resolvers;
import io.github.conanchen.taskproject.graphql.model.IssueGQO;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
class IssueResolver implements Resolvers.Issue, GraphQLResolver<IssueGQO> {
    @Override
    public Connection<UserGQO> participants(IssueGQO parent, String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        return new SimpleListConnection<>(
                Arrays.asList(
                        new UserGQO("username1", "name1", "bio1", "bioHTML1", null, "id1"),
                        new UserGQO("username2", "name2", "bio2", "bioHTML2", null, "id2"),
                        new UserGQO("username3", "name3", "bio3", "bioHTML3", null, "id3"),
                        new UserGQO("username4", "name4", "bio4", "bioHTML4", null, "id4")
                )
        ).get(env);
    }
}