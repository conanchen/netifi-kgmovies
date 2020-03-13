package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.*;

import java.util.Collection;

public interface Query {

    SoftwareApplicationsConnectionGQO allSoftwareApplications(String after, Integer first, String before, Integer last) throws Exception;

    SoftwareApplicationGQO softwareApplication(String id, String softwareApplicationID) throws Exception;

    WebhookGQO webhook(String id, String webhookID) throws Exception;

    Collection<WebhookConnectionGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception;

}