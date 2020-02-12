package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationGQO;

public interface SoftwareApplicationQuery {

    SoftwareApplicationGQO softwareApplication(String id, String softwareApplicationID) throws Exception;

}