package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.model.*;
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

public class Resolvers{
    public interface SoftwareApplication {
    // KK
    }
    public interface Webhook {
    // KK
    }
    public interface WebhookAddPayload {
    // KK
        public Connection<WebhookGQO> webhookSearch(WebhookAddPayloadGQO parent,WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface WebhookAddError {
    // KK
    }
    public interface WebhookUpdatePayload {
    // KK
        public Connection<WebhookGQO> webhookSearch(WebhookUpdatePayloadGQO parent,WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface WebhookUpdateError {
    // KK
    }
    public interface WebhookDeletePayload {
    // KK
        public Connection<WebhookGQO> webhookSearch(WebhookDeletePayloadGQO parent,WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
}