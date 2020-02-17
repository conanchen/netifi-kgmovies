package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.EldercareGQO;

public interface EldercareQuery {

    EldercareGQO eldercare(String id, String lbsID) throws Exception;

}