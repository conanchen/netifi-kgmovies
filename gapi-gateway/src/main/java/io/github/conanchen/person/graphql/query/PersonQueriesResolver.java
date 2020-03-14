package io.github.conanchen.person.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.person.graphql.api.Query;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.person.graphql.model.UserGQO;
import io.github.utils.DataObjectBuilder;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class PersonQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public PersonGQO person(String id, String pId) throws Exception {
        return null;
    }

    @Override
    public UserGQO user(String id, String uId) throws Exception {
        return null;
    }

    public Connection<UserGQO> users(int first, String after, DataFetchingEnvironment env) {

        return new SimpleListConnection<>(
                Arrays.asList(
                        new UserGQO("username1", "name1", "bio1", "bioHTML1", null, "id1"),
                        new UserGQO("username2", "name2", "bio2", "bioHTML2", null, "id2"),
                        new UserGQO("username3", "name3", "bio3", "bioHTML3", null, "id3"),
                        DataObjectBuilder.of(UserGQO::new)
                                .with(UserGQO::setUsername, "Builder username4")
                                .with(UserGQO::setName, "Builder name4")
                                .with(UserGQO::setBio, "Builder bio4")
                                .with(UserGQO::setBioHTML, "Builder bioHTML4")
                                .with(UserGQO::setId, "id4")
                                .build()
                )
        ).get(env);
    }
}