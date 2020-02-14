package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.EldercareGQO;

public interface EldercareQuery {

    EldercareGQO eldercare(String id, String lbsID) throws Exception;

}