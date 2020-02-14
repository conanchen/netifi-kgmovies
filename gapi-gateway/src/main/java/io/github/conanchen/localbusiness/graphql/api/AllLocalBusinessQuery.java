package io.github.conanchen.localbusiness.graphql.api;

import io.github.conanchen.localbusiness.graphql.model.LocalBusinessConnectionGQO;

public interface AllLocalBusinessQuery {

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

}