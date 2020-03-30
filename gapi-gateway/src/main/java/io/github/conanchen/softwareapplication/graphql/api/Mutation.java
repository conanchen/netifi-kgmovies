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

public interface Mutation {
// KK
    WebhookAddPayloadGQO webhookAdd(Collection<WebhookAddInputGQO> input, DataFetchingEnvironment env) throws Exception;
    WebhookUpdatePayloadGQO webhookUpdate(WebhookUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
    WebhookDeletePayloadGQO webhookDelete(WebhookFilterGQO filter, DataFetchingEnvironment env) throws Exception;
}