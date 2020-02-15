package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.GeneralServiceGQO;

public interface GeneralServiceQuery {

    GeneralServiceGQO generalService(String id, String serviceID) throws Exception;

}