package io.github.conanchen.event.graphql.api;

import java.util.*;
import io.github.conanchen.event.graphql.model.*;
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
    public Connection<EventGQO> allEvents(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    EventGQO event(String id, String eventID, DataFetchingEnvironment env) throws Exception;
}