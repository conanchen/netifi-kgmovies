package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.*;

import java.util.Collection;

public interface Mutation {

    WebhookAddPayloadGQO webhookAdd(Collection<WebhookAddInputGQO> input) throws Exception;

    WebhookUpdatePayloadGQO webhookUpdate(WebhookUpdateInputGQO input) throws Exception;

    WebhookDeletePayloadGQO webhookDelete(WebhookFilterGQO filter) throws Exception;

}