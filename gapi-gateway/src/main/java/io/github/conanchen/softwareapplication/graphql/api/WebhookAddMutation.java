package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.WebhookAddInputGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookAddPayloadGQO;

import java.util.Collection;

public interface WebhookAddMutation {

    WebhookAddPayloadGQO webhookAdd(Collection<WebhookAddInputGQO> input) throws Exception;

}