package io.github.conanchen.softwareapplication.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import io.github.conanchen.softwareapplication.graphql.model.WebhookConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookDeletePayloadGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookDeletePayloadResolver implements GraphQLResolver<WebhookDeletePayloadGQO> {

    public Collection<WebhookConnectionGQO> webhookSearch(WebhookDeletePayloadGQO webhookDeletePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }
}