package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.PersonGQO;

public interface PersonQuery {

    PersonGQO person(String id, String pId) throws Exception;

}