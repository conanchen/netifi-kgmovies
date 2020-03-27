package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.WebhookUpdateInputGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookUpdatePayloadGQO;

public interface WebhookUpdateMutation {

    WebhookUpdatePayloadGQO webhookUpdate(WebhookUpdateInputGQO input) throws Exception;

}