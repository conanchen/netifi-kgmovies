package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.EldercareGQO;

public interface EldercareFindQuery {

    EldercareGQO eldercareFind(String id, String lbsID) throws Exception;

}