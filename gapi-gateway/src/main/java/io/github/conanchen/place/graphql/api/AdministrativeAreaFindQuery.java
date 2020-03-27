package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.AdministrativeAreaGQO;

public interface AdministrativeAreaFindQuery {

    AdministrativeAreaGQO administrativeAreaFind(String id, String defID) throws Exception;

}