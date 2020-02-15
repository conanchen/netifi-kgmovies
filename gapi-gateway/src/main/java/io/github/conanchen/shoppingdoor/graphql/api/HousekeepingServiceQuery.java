package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.HousekeepingServiceGQO;

public interface HousekeepingServiceQuery {

    HousekeepingServiceGQO housekeepingService(String id, String serviceID) throws Exception;

}