package io.github.conanchen.softwareapplication.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookAddPayloadGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class WebhookPayloadAddResolver implements GraphQLResolver<WebhookAddPayloadGQO> {

    public Collection<WebhookConnectionGQO> webhookSearch(WebhookAddPayloadGQO webhookAddPayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }
}