package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import io.github.conanchen.event.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    public Connection<SoftwareApplicationGQO> softwareapplicationSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    SoftwareApplicationGQO softwareapplicationFind(String id, String softwareApplicationID, DataFetchingEnvironment env) throws Exception;
    WebhookGQO webhookFind(String id, String webhookID, DataFetchingEnvironment env) throws Exception;
    public Connection<WebhookGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
}