package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.UserGQO;

public interface UserQuery {

    UserGQO user(String id, String uId) throws Exception;

}