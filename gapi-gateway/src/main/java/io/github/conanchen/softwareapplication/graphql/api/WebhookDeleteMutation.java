package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.WebhookDeletePayloadGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;

public interface WebhookDeleteMutation {

    WebhookDeletePayloadGQO webhookDelete(WebhookFilterGQO filter) throws Exception;

}