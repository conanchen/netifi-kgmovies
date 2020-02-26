package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.AdministrativeAreaGQO;

public interface AdministrativeAreaQuery {

    AdministrativeAreaGQO administrativeArea(String id, String defID) throws Exception;

}