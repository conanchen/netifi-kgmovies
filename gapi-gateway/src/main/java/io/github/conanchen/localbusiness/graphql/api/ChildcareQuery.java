package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.ChildcareGQO;

public interface ChildcareQuery {

    ChildcareGQO childcare(String id, String lbsID) throws Exception;

}