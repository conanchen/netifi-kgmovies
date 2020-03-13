package io.github.conanchen.softwareapplication.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.softwareapplication.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookUpdatePayloadResolver implements GraphQLResolver<WebhookUpdatePayloadGQO> {

    public Collection<WebhookConnectionGQO> webhookSearch(WebhookUpdatePayloadGQO webhookUpdatePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }
}