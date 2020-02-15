package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.ServicesConnectionGQO;

public interface AllServicesQuery {

    ServicesConnectionGQO allServices(String after, Integer first, String before, Integer last) throws Exception;

}