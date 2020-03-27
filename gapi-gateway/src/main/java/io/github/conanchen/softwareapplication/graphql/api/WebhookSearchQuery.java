package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.WebhookConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;

import java.util.Collection;

public interface WebhookSearchQuery {

    Collection<WebhookConnectionGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception;

}