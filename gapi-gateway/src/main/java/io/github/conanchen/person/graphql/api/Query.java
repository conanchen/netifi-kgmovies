package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.PersonGQO;

public interface Query {

    PersonGQO person(String id, String pId) throws Exception;

}