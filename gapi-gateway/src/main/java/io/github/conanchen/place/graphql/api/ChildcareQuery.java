package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.ChildcareGQO;

public interface ChildcareQuery {

    ChildcareGQO childcare(String id, String lbsID) throws Exception;

}