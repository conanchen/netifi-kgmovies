package io.github.conanchen.softwareapplication.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import io.github.conanchen.softwareapplication.graphql.model.WebhookAddPayloadGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookAddPayloadResolver implements GraphQLResolver<WebhookAddPayloadGQO> {

    public Collection<WebhookConnectionGQO> webhookSearch(WebhookAddPayloadGQO webhookAddPayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }
}