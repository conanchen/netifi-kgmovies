package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.person.graphql.model.UserGQO;

public interface Query {

    PersonGQO person(String id, String pId) throws Exception;

    UserGQO user(String id, String uId) throws Exception;

}