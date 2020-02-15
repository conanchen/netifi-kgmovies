package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.DemandGQO;

public interface DemandQuery {

    DemandGQO demand(String id, String demandID) throws Exception;

}