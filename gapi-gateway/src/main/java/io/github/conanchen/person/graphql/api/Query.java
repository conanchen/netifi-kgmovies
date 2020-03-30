package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    PersonGQO person(String id, String pId, DataFetchingEnvironment env) throws Exception;
    UserGQO user(String id, String uId, DataFetchingEnvironment env) throws Exception;
    public Connection<UserGQO> users(Integer first, String after, DataFetchingEnvironment env);
}