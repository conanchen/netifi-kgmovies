package io.github.conanchen.softwareapplication.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.softwareapplication.graphql.model.WebhookDeletePayloadGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookDeletePayloadResolver implements GraphQLResolver<WebhookDeletePayloadGQO> {

    public Connection<WebhookGQO> webhookSearch(WebhookDeletePayloadGQO webhookDeletePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order,
                                                Integer first, Integer offset, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}