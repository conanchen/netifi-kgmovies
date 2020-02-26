package io.github.conanchen.place.graphql.api;

import io.github.conanchen.place.graphql.model.LocalBusinessConnectionGQO;

public interface AllLocalBusinessQuery {

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

}