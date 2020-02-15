package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.ServiceGQO;

public interface ServiceQuery {

    ServiceGQO service(String id, String serviceID) throws Exception;

}