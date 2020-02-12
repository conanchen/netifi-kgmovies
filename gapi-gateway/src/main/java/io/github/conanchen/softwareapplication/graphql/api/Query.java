package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationGQO;
import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationsConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookGQO;

public interface Query {

    SoftwareApplicationsConnectionGQO allSoftwareApplications(String after, Integer first, String before, Integer last) throws Exception;

    SoftwareApplicationGQO softwareApplication(String id, String softwareApplicationID) throws Exception;

    WebhookGQO webhook(String id, String webhookID) throws Exception;
}