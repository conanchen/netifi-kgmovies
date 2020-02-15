package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.GovernmentServiceGQO;

public interface GovernmentServiceQuery {

    GovernmentServiceGQO governmentService(String id, String serviceID) throws Exception;

}