package io.github.conanchen.softwareapplication.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import io.github.conanchen.softwareapplication.graphql.model.WebhookConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookUpdatePayloadGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookUpdatePayloadResolver implements GraphQLResolver<WebhookUpdatePayloadGQO> {

    public Collection<WebhookConnectionGQO> webhookSearch(WebhookUpdatePayloadGQO webhookUpdatePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }
}