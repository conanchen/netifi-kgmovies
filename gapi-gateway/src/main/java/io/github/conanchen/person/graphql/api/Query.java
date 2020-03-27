package io.github.conanchen.person.graphql.api;

import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.person.graphql.model.UserGQO;

public interface Query {
// KK
    PersonGQO person(String id, String pId, DataFetchingEnvironment env) throws Exception;
    UserGQO user(String id, String uId, DataFetchingEnvironment env) throws Exception;
    public Connection<UserGQO> users(Integer first, String after, DataFetchingEnvironment env);
}