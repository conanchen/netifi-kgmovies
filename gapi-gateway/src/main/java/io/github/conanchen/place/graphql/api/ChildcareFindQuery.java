package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.ChildcareGQO;

public interface ChildcareFindQuery {

    ChildcareGQO childcareFind(String id, String lbsID) throws Exception;

}