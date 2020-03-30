package io.github.conanchen.softwareapplication.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookUpdatePayloadGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookUpdatePayloadResolver implements GraphQLResolver<WebhookUpdatePayloadGQO> {

    public Connection<WebhookGQO> webhookSearch(WebhookUpdatePayloadGQO webhookUpdatePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order,
                                                Integer first, Integer offset, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}