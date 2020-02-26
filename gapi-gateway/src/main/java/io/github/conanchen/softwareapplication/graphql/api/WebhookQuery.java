package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.WebhookGQO;

public interface WebhookQuery {

    WebhookGQO webhook(String id, String webhookID) throws Exception;

}